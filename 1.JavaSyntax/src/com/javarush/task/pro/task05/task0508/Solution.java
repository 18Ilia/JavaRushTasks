package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];
        String[] currentString = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
            currentString[i] = strings[i];
        }
        for (int j = 0; j < strings.length; j++) {
            for (int i = j + 1; i < strings.length; i++) {
                if (currentString[j].equals(strings[i])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
            System.out.print(strings[j] + ", ");
        }
    }
}
