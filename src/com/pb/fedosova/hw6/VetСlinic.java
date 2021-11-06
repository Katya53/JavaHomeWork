package com.pb.fedosova.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Собака", "мясо", "вольер");
        Cat cat = new Cat("Кот", "молоко", "дом");
        Horse horse = new Horse("Лошадь", "сено", "загон");
        Animal[] animal = new Animal[3];
        animal[0] = dog;
        animal[1] = cat;
        animal[2] = horse;

        Class clazz = Class.forName(" ");
        Constructor cons = clazz.getConstructor(new Class[]{});
        Object obj = cons.newInstance();

        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animal.length; i++) {
                ((Veterinarian) obj).treatAnimal(animal[i]);
            }
        }
    }
}

