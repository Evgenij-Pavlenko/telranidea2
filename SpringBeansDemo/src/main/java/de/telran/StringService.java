package de.telran;

import org.springframework.stereotype.Component;

@Component
public class StringService {
    public String getString(){
        return "Hallo world";
    }
}
