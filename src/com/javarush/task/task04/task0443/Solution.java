package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int d = Integer.getInteger(br.readLine());
        int m = Integer.getInteger(br.readLine());
        int y = Integer.getInteger(br.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.print("Я родился "+d+"."+m+"."+y);
    }
}