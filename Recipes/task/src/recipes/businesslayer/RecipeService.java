package recipes.businesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipes.persistence.RecipeRepository;

import java.util.*;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public Optional<Recipe> findRecipeById(long id) {
        return recipeRepository.findById(id);
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public boolean deleteRecipeById(long id) {
        try {
            recipeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateRecipeById(long id, Recipe recipe) {
        Optional<Recipe> optRecipe = recipeRepository.findById(id);
        if (optRecipe.isPresent()) {
            Recipe foundRecipe = optRecipe.get();
            foundRecipe.copy(recipe);
            foundRecipe.setId(id);
            recipeRepository.save(foundRecipe);
            return true;
        } else {
            return false;
        }
    }

    public List<Recipe> findRecipesByCategory(String category) {
        return recipeRepository.findByCategoryIgnoreCaseOrderByDateDesc(category);
    }

    public List<Recipe> findRecipesByNameContaining(String keyword) {
        return recipeRepository.findByNameIgnoreCaseContainingOrderByDateDesc(keyword);
    }
}
