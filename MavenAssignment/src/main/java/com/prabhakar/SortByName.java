package com.prabhakar;

import java.util.Comparator;

public class SortByName implements Comparator<Sweet> {
    @Override
    public int compare(Sweet sweet1, Sweet sweet2) {
        return sweet1.name.compareTo(sweet2.name);
    }
}
