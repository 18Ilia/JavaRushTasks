package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();//переменная пессимиста\оптимиста
        if (a){ //если переменная "тру", будет "1", если "фолс", то выполняется "иначе"
            int b = (int)Math.ceil(glass);
            System.out.println(b);
        }else{
            int b = (int)Math.floor(glass);
            System.out.println(b);
        }

    }
}