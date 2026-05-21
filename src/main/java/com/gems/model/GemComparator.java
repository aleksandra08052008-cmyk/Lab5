package com.gems.model;

import java.util.Comparator;

public class GemComparator implements Comparator<Gem> {
    @Override
    public int compare(Gem o1, Gem o2) {
        return Double.compare(o1.getTotalPrice(), o2.getTotalPrice());
    }
}
