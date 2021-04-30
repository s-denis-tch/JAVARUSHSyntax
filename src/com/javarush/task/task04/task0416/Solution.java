package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        double t = Double.parseDouble(br.readLine());

        int b = (int) t;
        int remain = b % 5;
        if (remain==3) {
            System.out.println("желтый");
            return;
        }

        if (remain==4) {
            System.out.println("красный");
            return;
        }
        System.out.println("зелёный");//напишите тут ваш код

    }
}