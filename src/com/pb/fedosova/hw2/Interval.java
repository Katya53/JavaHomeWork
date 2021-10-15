package com.pb.fedosova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        num = s.nextInt();

        if (num >= 0 & num <= 14) {
            System.out.println("Число находится в промежутке от 0 до 14");
        }
        if (num >= 15 & num <= 35) {
            System.out.println("Число находится в промежутке от 15 до 35");
        }
        if (num >= 36 & num <= 50) {
            System.out.println("Число находится в промежутке от 36 до 50");
        }
        if (num >= 51 & num <= 100) {
            System.out.println("Число находится в промежутке от 51 до 100");
        }
        if (num < 0 || num > 100) {
            System.out.println("Введеное число не входит ни в один промежуток");
        }
    }

}
