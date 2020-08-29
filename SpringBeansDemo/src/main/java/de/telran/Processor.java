package de.telran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Processor {
    private StringService stringService;
    private IntegerService integerService;

//    @Autowired
    public Processor(StringService stringService, IntegerService integerService) {
        this.stringService = stringService;
        this.integerService = integerService;
    }
    public void process(){
        System.out.println(stringService.getString() + integerService.getInteger());
    }
}
