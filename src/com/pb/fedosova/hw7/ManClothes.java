package com.pb.fedosova.hw7;

public interface ManClothes {
    default void dressMan(){
        System.out.println("ManClothes: title, size, price, color");
    }
}
