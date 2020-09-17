package de.telran;

import de.telran.entity.Item;
import de.telran.service.ItemService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        List<Item> list = new ArrayList<>();
//        Item i1 = new Item("one", "S");
//        Item i2 = new Item("two", "L");
//        list.add(i1);
//        list.add(i2);
//        ItemService itemService = new ItemService(list);
//        itemService.addItem(i1);
//        itemService.addItem(i2);
//        System.out.println(itemService.getItem());

    }
}
