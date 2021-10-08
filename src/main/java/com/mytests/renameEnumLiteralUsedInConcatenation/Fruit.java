package com.mytests.renameEnumLiteralUsedInConcatenation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruit {
    @Id
    private Long id;

    private FruitType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }
}
