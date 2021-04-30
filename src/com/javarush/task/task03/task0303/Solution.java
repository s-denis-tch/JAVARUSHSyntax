package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,1.3));//напишите тут ваш код
        System.out.println(convertEurToUsd(8, 2.3));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
         double usd = eur * exchangeRate;//напишите тут ваш код
         return usd;
    }
}
