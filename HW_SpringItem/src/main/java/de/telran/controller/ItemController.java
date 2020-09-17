package de.telran.controller;

import de.telran.entity.Item;
import de.telran.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/api/items")
    public void addItem(@RequestBody Item item){
        this.itemService.addItem(item);
    }

    @GetMapping("/api/items")
    public List<Item> getItem(){
        return itemService.getItem();
    }

    @GetMapping("/api/items/{id}")
    public Item getItemById(Long id){
        return itemService.getItemById(id);
    }
}
