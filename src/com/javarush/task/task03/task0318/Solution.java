package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name = reader.readLine();
       String sAge = reader.readLine();
       int nAge = Integer.parseInt(sAge);
       System.out.println(name + " захватит мир через ало" + nAge + " лет. Му-ха-ха!");//напишите тут ваш код

    }
}
