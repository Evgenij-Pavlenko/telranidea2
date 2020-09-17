package de.telran.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Item {
   private @Id
    @GeneratedValue
    Long id;
    String name;
    String size;

    public Item() {
    }

    public Item(String name, String size) {
        this.name = name;
        this.size = size;
    }
}
