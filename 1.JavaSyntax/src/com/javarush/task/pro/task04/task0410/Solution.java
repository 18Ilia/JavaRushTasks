package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
          while (scanner.hasNextInt()){
                int x = scanner.nextInt();
                if (x < firstMin){
                    secondMin = firstMin;// эта команда, при котором секондМин, теперь становится равным фирстМин
                    firstMin = x;// то есть перезаписывается
                } else if (x < secondMin && x != firstMin) {
                    secondMin = x;
                }
          }
        System.out.println(secondMin);


    }
}