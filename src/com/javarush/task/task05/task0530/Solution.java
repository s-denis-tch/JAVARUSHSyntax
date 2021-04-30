package com.jav5arush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.getInteger(reader.readLine());
        int b = Integer.getInteger(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
