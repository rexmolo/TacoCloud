package io.github.rexmolo.tacocloud.domain.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data//lombok
public class Taco {

    @NotNull
    @Size(min=5, message = "Name must be at least 5 characters long")
    //above come from spring-boot-starter-validation
    private String name;

    @NotNull
    @Size(min=1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
