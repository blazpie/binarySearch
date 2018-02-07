package com.codecool.blazpie;

import java.util.Collections;
import java.util.List;

public class Searcher {

    public boolean search(List<Integer> list, Integer element) {
        int first = 0;
        int last = list.size() - 1;
        while (last >= first) {
            int half = first + (last - first) / 2;
            if (list.get(half).equals(element)) {
                return true;
            } else if (list.get(half) > element){
                last = half - 1;
            } else {
                first = half + 1;
            }
        }
        return false;
    }
}
