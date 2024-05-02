package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while (a < 100){
            a++;
            if (a % 3 == 0){
                continue;
            }
            sum += a;//к sum прибвалеям а, и получаем суммы
        }
        System.out.println(sum);



    }
}