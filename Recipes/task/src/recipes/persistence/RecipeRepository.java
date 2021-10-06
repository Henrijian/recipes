package recipes.persistence;

import recipes.businesslayer.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findById(long id);
    void deleteById(long id);
    List<Recipe> findByCategoryIgnoreCaseOrderByDateDesc(String category);
    List<Recipe> findByNameIgnoreCaseContainingOrderByDateDesc(String keyword);
}
