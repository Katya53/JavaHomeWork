package com.pb.fedosova.hw6;

import java.util.Objects;

public class Horse {
    public Horse(String horse, String hay, String paddock) {
    }

    public class Horse extends Animal {
        private String saddle;

        public Horse(String variety, String food, String location) {
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
            return "Лошадь: " +
                    "еда = '" + getFood() + '\'' +
                    ", место нахождения = '" + getLocation() + '\'' +
                    ';';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Horse horse = (Horse) o;
            return Objects.equals(saddle, horse.saddle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(saddle);
        }
    }
}
