package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> hs = new HashSet<String>();
        hs.add("арбуз");
        hs.add("банан");
        hs.add("вишня");
        hs.add("груша");
        hs.add("дыня");
        hs.add("ежевика");
        hs.add("женьшень");
        hs.add("земляника");
        hs.add("ирис");
        hs.add("картофель");

        for (Object o:  hs) {
            System.out.println((String)o );
        }
    }
}
