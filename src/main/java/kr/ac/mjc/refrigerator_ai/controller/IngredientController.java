package kr.ac.mjc.refrigerator_ai.controller;

import kr.ac.mjc.refrigerator_ai.entity.Ingredient;
import kr.ac.mjc.refrigerator_ai.repository.IngredientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final IngredientRepository repo;

    public IngredientController(IngredientRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Ingredient> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient getOne(@PathVariable Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found: " + id));
    }
}
