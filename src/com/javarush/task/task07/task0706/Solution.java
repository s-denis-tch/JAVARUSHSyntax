package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] vect = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<vect.length;i++) {
            vect[i] = Integer.parseInt(br.readLine());
        }


        int even_sum = 0;
        int odd_sum = 0;
        for (int i=0;i<vect.length;i++) {
            if ((i % 2) ==0)
                even_sum += vect[i];
            else
                odd_sum += vect[i];
        }

        if (even_sum>odd_sum)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}