package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k=0;
        for (int i=0;i<3;i++) {
            int a = Integer.parseInt(br.readLine());
            if (a>0)
                k += 1;
        }

        System.out.println(k);


    }
}