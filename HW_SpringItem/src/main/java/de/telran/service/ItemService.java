package de.telran.service;

import de.telran.entity.Item;
import de.telran.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> getItem() {
        return itemRepository.findAll();
    }

    public Item getItemById(Long id) { // Optional wenn findById(Long id)
        return itemRepository.getOne(id);
    }
}
