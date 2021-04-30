package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int str_max_len = 0;
        String tmp;
        int tmp_len;

        for (int i = 0; i <5; i++ ) {
            tmp = br.readLine();
            tmp_len = tmp.length();


            if (tmp_len > str_max_len) {
                str_max_len = tmp_len;

                list.add(tmp);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == str_max_len){
                System.out.println(list.get(i));
            }
        }
        //напишите тут ваш код
    }
}
