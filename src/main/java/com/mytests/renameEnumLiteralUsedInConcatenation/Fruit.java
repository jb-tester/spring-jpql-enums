package com.mytests.renameEnumLiteralUsedInConcatenation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fruits", schema = "enums")
public class Fruit {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
