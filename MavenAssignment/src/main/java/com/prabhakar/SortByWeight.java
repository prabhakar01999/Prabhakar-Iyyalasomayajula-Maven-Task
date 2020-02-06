package com.prabhakar;

import java.util.Comparator;

public class SortByWeight implements Comparator<Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2) {
        return sweet1.weight - sweet2.weight;
    }
}
