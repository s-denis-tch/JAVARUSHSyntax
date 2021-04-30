package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int a_r400 = a % 400;
        int a_r100 = a % 100;
        int a_r4 = a % 4;
        int res = 365;

        if (a_r4 == 0) {
            res = 366;
        }

        if (a_r100 == 0 && a_r400 != 0) {
            res = 365;
        }
        System.out.println("количество дней в году: "+ res);

//напишите тут ваш код

    }
}