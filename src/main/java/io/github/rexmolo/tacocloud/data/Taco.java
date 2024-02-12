package io.github.rexmolo.tacocloud.data;

import io.github.rexmolo.tacocloud.data.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
