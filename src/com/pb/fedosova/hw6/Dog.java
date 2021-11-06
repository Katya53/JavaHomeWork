package com.pb.fedosova.hw6;

import java.util.Objects;

public class Dog {
    public Dog(String dog, String meat, String aviary) {
    }

    public class Dog extends Animal {
        private String collar;

        public Dog(String variety, String food, String location) {
            super(variety, food, location);
        }

        @Override
        public void makeNoise() {
            super.makeNoise();
        }

        @Override
        public void eat() {
            super.eat();
        }

        @Override
        public String toString() {
            return "Собака: " +
                    "еда = '" + getFood() + '\'' +
                    ", место нахождения = '" + getLocation() + '\'' +
                    ';';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return Objects.equals(collar, dog.collar);
        }

        @Override
        public int hashCode() {
            return Objects.hash(collar);
        }
    }
}