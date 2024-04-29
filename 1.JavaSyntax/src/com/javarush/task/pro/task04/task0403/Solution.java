package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;
        while (!(input = scanner.nextLine()).equals("ENTER")) {
            sum = sum + Integer.parseInt(input);
        }
        System.out.println(sum);
    }
}