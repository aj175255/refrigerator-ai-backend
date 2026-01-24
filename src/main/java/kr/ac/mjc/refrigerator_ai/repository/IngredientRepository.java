package kr.ac.mjc.refrigerator_ai.repository;

import kr.ac.mjc.refrigerator_ai.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
