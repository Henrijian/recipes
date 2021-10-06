package recipes.presentation;

import recipes.AuthenticationFacade;
import recipes.businesslayer.Recipe;
import recipes.users.businesslayer.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import recipes.businesslayer.RecipeService;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.*;

@Validated
@RestController
@RequestMapping("/api/recipe")
public class RecipesController {
    @Autowired
    private RecipeService recipeService;

    @Autowired
    private AuthenticationFacade authenticationFacade;

    @PostMapping("/new")
    public ResponseEntity<Map<String, Long>> addRecipe(@Valid @RequestBody Recipe recipe) {
        try {
            Authentication auth = authenticationFacade.getAuthentication();
            User author = new User((UserDetails) auth.getPrincipal());
            recipe.setDate(LocalDateTime.now());
            recipe.setAuthor(author);
            Recipe savedRecipe = recipeService.saveRecipe(recipe);
            return ResponseEntity.ok(Map.of("id", savedRecipe.getId()));
        } catch (ConstraintViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable @Min(0) long id) {
        try {
            Optional<Recipe> optRecipe = recipeService.findRecipeById(id);
            return optRecipe.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (IllegalArgumentException | ConstraintViolationException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable @Min(0) long id, @Valid @RequestBody Recipe newRecipe) {
        try {
            Optional<Recipe> oldRecipeOpt = recipeService.findRecipeById(id);
            if (oldRecipeOpt.isEmpty()) {
                return ResponseEntity.badRequest().build();
            }
            Recipe oldRecipe = oldRecipeOpt.get();
            Authentication auth = authenticationFacade.getAuthentication();
            User author = new User((UserDetails) auth.getPrincipal());
            if (!oldRecipe.getAuthor().getEmail().equals(author.getEmail())) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
            newRecipe.setDate(LocalDateTime.now());
            newRecipe.setAuthor(author);
            return recipeService.updateRecipeById(id, newRecipe) ?
                    ResponseEntity.noContent().build() :
                    ResponseEntity.notFound().build();
        } catch (ConstraintViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable @Min(0) long id) {
        try {
            Optional<Recipe> recipeOpt = recipeService.findRecipeById(id);
            if (recipeOpt.isEmpty()) {
                return ResponseEntity.badRequest().build();
            }
            Recipe recipe = recipeOpt.get();
            Authentication auth = authenticationFacade.getAuthentication();
            User author = new User((UserDetails) auth.getPrincipal());
            if (!recipe.getAuthor().getEmail().equals(author.getEmail())) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            }
            return recipeService.deleteRecipeById(id) ?
                    ResponseEntity.noContent().build() :
                    ResponseEntity.notFound().build();
        } catch (ConstraintViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Recipe>> getRecipesByCategory(@RequestParam Optional<String> category,
                                                             @RequestParam("name") Optional<String> keyword) {
        if ((category.isEmpty() && keyword.isEmpty()) || (category.isPresent() && keyword.isPresent())) {
            return ResponseEntity.badRequest().build();
        }
        if (category.isPresent()) {
            return ResponseEntity.ok(recipeService.findRecipesByCategory(category.get()));
        } else {
            return ResponseEntity.ok(recipeService.findRecipesByNameContaining(keyword.get()));
        }
    }
}
