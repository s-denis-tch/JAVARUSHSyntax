package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int sum = 0;
        while (a!=-1) {
            a = Integer.parseInt(br.readLine());
            sum += a;
        }
        System.out.println(sum);
    }
}