package com.pb.fedosova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        int result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Укажите первое число: ");
        operand1 = s.nextInt();

        System.out.print("Укажите знак операции:");
        sign = s.next();

        System.out.print("Укажите второе число: ");
        operand2 = s.nextInt();

        switch (sign) {
            case "*": {
                result = operand1 * operand2;
                System.out.println("Результат:" + result);
                break;
            }
            case "/": {
                if (operand2 == 0) {
                    System.out.println("Делить на 0 нельзя. Повторите попытку");
                }
                result = operand1 / operand2;
                System.out.println("Результат:" + result);
                break;
            }
            case "+": {
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            }
            case "-": {
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            }
            default: {
                System.out.println("Вы ввели не верный знак орерации. Повторите еще раз ");

            }
        }

    }
}

