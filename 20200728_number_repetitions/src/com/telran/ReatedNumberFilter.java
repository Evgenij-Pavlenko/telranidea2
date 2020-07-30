package com.telran;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReatedNumberFilter {
    public List<Integer> remainRepeated(List<Integer> numbers) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> appeard = new HashSet<>();
        for (int num: numbers) {
            if (appeard.contains(num)){
                res.add(num);
            } else{
                appeard.add(num);
            }
        }
        return new ArrayList<>(res);
    }
}
