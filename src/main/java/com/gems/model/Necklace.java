package com.gems.model;

import com.gems.model.exceptions.EmptyNecklaceException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас-обгортка для масиву каменів (намисто).
 */
public class Necklace {

    private final List<Gem> gems = new ArrayList<>();

    public void addGem(Gem gem) {
        gems.add(gem);
    }

    public double totalWeight() throws EmptyNecklaceException {
        if (gems.isEmpty()) {
            throw new EmptyNecklaceException("Necklace is empty");
        }
        return gems.stream().mapToDouble(Gem::getCaratWeight).sum();
    }

    public double totalPrice() throws EmptyNecklaceException {
        if (gems.isEmpty()) {
            throw new EmptyNecklaceException("Necklace is empty");
        }
        return gems.stream().mapToDouble(Gem::getTotalPrice).sum();
    }

    public void sortByValue() {
        gems.sort(Comparator.comparingDouble(Gem::getTotalPrice));
    }

    public List<Gem> findByTransparencyRange(double min, double max) {
        return gems.stream()
                .filter(g -> g.getTransparency() >= min && g.getTransparency() <= max)
                .toList();
    }

    public List<Gem> getGems() {
        return gems;
    }
}
