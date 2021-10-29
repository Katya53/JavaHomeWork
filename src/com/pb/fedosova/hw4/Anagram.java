package com.pb.fedosova.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static String userExpr() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String userExpr = s.nextLine();
        return userExpr.toLowerCase();
    }

    private static String isAnagram(String first, String second) {

        if (first == null || second == null || first.equals("") || second.equals("")) {
            return "Это не анаграмма";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "Это не анаграмма";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Правильно это анаграмма";
        } else {
            answer = "Это не анаграмма";
        }
        return answer;
    }

    public static void main(String[] args) {
        String str1 = userExpr();
        String str2 = userExpr();
        System.out.println(isAnagram(str1, str2));
    }
}
