package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

import java.util.Arrays;

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        result = new int[10][];
        for (int i = 0, j = 1; i < result.length; i++, j++) {
            result[i] = new int[j];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] = i + j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
