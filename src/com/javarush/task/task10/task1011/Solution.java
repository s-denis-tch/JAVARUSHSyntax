package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";

        StringBuffer str = new StringBuffer(text);
        for (int i=0;i<40;i++)

            System.out.println(str.substring(i).trim());//напишите тут ваш код
    }

}

