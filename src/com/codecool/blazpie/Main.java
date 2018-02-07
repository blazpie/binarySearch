package com.codecool.blazpie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Searcher srch = new Searcher();
        List<Integer> list = makeList(9863);
        Collections.sort(list);
        boolean doContain = srch.search(list, list.get(3));

    }

    public static List<Integer> makeList(int size) {
        List<Integer> list = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            list.add(generator.nextInt());
        }
        return list;
    }
}
