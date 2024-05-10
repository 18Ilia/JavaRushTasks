package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
                int number = scanner.nextInt();
                do {
                    System.out.println(s);
                    number--;
                }while (0 < number && number < 4);
            }
    }
