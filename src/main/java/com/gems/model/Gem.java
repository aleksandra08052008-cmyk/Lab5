package com.gems.model;

/**
 * Базовий клас для всіх каменів.
 */
public abstract class Gem {

    private String name;
    private double caratWeight;
    private double pricePerCarat;
    private double transparency; // 0..1

    public Gem(String name, double caratWeight, double pricePerCarat, double transparency) {
        this.name = name;
        this.caratWeight = caratWeight;
        this.pricePerCarat = pricePerCarat;
        this.transparency = transparency;
    }

    public double getTotalPrice() {
        return caratWeight * pricePerCarat;
    }

    public String getName() {
        return name;
    }

    public double getCaratWeight() {
        return caratWeight;
    }

    public double getPricePerCarat() {
        return pricePerCarat;
    }

    public double getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return name + " | " + caratWeight + " ct | " + getTotalPrice() + "$ | " + transparency;
    }
}
