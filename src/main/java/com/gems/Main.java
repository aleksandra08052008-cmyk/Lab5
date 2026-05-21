package com.gems;

import com.gems.model.*;
import com.gems.model.exceptions.EmptyNecklaceException;

public class Main {

    public static void main(String[] args) {

        Necklace necklace = new Necklace();

        necklace.addGem(new PreciousGem("Diamond", 1.2, 5000, 0.95));
        necklace.addGem(new PreciousGem("Ruby", 2.0, 3000, 0.80));
        necklace.addGem(new SemiPreciousGem("Amethyst", 3.5, 200, 0.60));

        try {
            System.out.println("Total weight: " + necklace.totalWeight());
            System.out.println("Total price: " + necklace.totalPrice());
        } catch (EmptyNecklaceException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nSorted by value:");
        necklace.sortByValue();
        necklace.getGems().forEach(System.out::println);

        System.out.println("\nTransparency 0.7 - 1.0:");
        necklace.findByTransparencyRange(0.7, 1.0)
                .forEach(System.out::println);
    }
}
