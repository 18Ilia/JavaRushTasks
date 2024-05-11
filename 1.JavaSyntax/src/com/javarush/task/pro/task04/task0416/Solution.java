package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cola = scanner.nextInt();//кол-во банок
        int people = scanner.nextInt();//кол-во людей
        double share = 1.0 * cola / people;
        System.out.println(share);

    }
}