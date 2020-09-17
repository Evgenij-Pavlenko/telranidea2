package de.telran.service;

import de.telran.entity.Item;
import de.telran.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private List<Item> items;

    @Autowired
    public ItemService(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItem() {
        return items;
    }

    public Item getItemById(Long id) { // Optional wenn findById(Long id)
        return items.get(Math.toIntExact(id));
    }
}
