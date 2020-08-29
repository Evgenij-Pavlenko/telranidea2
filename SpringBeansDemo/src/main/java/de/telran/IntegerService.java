package de.telran;

import org.springframework.stereotype.Component;

//@Component
public class IntegerService {

    private int secret = 55;

    public int getInteger() {
        return secret;
    }
}
