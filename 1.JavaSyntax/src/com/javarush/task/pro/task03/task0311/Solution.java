package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(a - b) <= 0.000001){
            System.out.println("числа равны");//напишите тут ваш код
        }else{
            System.out.println("числа не равны");
        }
        //напишите тут ваш код

    }
}
