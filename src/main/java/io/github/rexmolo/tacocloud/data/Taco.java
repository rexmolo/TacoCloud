package io.github.rexmolo.tacocloud.data;

import lombok.Data;

import java.util.List;

@Data//lombok
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
