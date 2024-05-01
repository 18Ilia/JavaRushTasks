package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int stringB = 0;
        while (stringB < 20) {
            System.out.print("Б");
            stringB++;
        }//этот цикл только ставит строку из "Б"
        System.out.println();//это переносит на новую строку
        int stringBB = 0;
        while (stringBB < 8) {
            System.out.print("Б");
            stringBB++;//этот цикл пишет первую букву Б
            int str = 0;
            while (str < 18){
                System.out.print(" ");
                str++;//этот цикл ставить пробелы
                }
            System.out.println("Б"); //ставит последнюю букву Б
        }
        int stringB2 = 0;
        while (stringB2 < 20) {
            System.out.print("Б");
            stringB2++; // ставит последнюю строку Б
        }



    }
}