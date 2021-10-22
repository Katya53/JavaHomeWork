package com.pb.fedosova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int iNumber = random.nextInt(101);
        Scanner s = new Scanner(System.in);
        System.out.println("Для завершения игры введите - '-5'");
        System.out.println("Введите целое число от 0 до 100: ");

        while (iNumber >= 0) {
            count++;
            int userNumber = s.nextInt();

            if (userNumber == -5) {
                break;
            }
            if (userNumber > iNumber) {
                System.out.println("Это число больше чем мы загадали. Попробуй еще");
                continue;
            }
            if (userNumber < iNumber) {
                System.out.println("Это число меньше чем мы загадали. Попробуй еще");
                continue;
            }

            if (userNumber == iNumber) {
                System.out.println("Поздравляем! Вы угадали с " + count + " попыток");
                break;
            }

        }
        System.out.println("ИГРА ОКОНЧЕНА");


    }
}