package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] vect = new int [3];

        for (int i=0;i<vect.length;i++) {
            vect[i] = Integer.parseInt(br.readLine());
        }

        int flag;
        for (int i=0;i<vect.length;i++) {
            flag=0;
            for (int j=0;j<vect.length;j++) {
                if (vect[i]==vect[j] && i!=j && vect[i] != -1) {
                    System.out.print(vect[j]+" ");
                    vect[j] = -1;
                    flag = 1;

                }
            }
            if (flag==1)
                System.out.print(vect[i]);
        }
    }
}