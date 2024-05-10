package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
      for(int i = 0; i < 10; i++){ //этот цикл отвечает за переход на новую строку
          int eith = 0 + i;
          for(int y = 0; y <= eith; y++){
              System.out.print("8");
          }
          System.out.println();
      }
    }
}