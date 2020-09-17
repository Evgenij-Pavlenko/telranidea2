package de.telran.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    String name;
    Enum size;

    public Item() {
    }

    public Item(String name, Enum size) {
        this.name = name;
        this.size = size;
    }
}
