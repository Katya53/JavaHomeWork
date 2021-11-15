package com.pb.fedosova.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        String size;
        return "Pants: " +
                "size " + size +
                ", price " + price +
                ", color '" + color + '\'';
    }
}
