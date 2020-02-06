package com.prabhakar;

import java.util.Comparator;

public class SortByCost implements Comparator<Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2) {
        return sweet1.cost - sweet2.cost;
    }
}
