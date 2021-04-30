package com.javarush.task.task07.task0718;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <String> lst = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            lst.add(br.readLine());
        }

        for (int i=0; i<lst.size()-1; i++) {
            if (lst.get(i).length()>lst.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }


    }
}

