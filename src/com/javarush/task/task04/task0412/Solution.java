package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int a = Integer.parseInt(br.readLine());
        if (a > 0) {
            a = a * 2;
            System.out.println(a);
            return;
        } else if (a < 0){
            a = a + 1;
            System.out.println(a);
            return;
        } else {
            System.out.println(a);
            return;
        }
    }

}