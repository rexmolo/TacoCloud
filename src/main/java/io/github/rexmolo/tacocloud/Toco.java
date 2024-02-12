package io.github.rexmolo.tacocloud;

import lombok.Data;

import java.util.List;

@Data
public class Toco {
    private String name;
    private List<Ingredient> ingredients;
}
