package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();
        String result = secret.equalsIgnoreCase(comand) ? "доступ разрешен" : "доступ запрещен";
        System.out.println(result);
    }
}
