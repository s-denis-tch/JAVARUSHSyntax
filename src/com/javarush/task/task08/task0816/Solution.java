package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 1 2012"));
        map.put("Семенов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнович", dateFormat.parse("MAY 1 2012"));
        map.put("Попов", dateFormat.parse("MAY 1 2012"));
        map.put("Попович", dateFormat.parse("MAY 1 2012"));
        map.put("Казанцев", dateFormat.parse("MAY 1 2012"));
        map.put("Антропов", dateFormat.parse("MAY 1 2012"));
        map.put("Семенович", dateFormat.parse("MAY 1 2012"));
        map.put("Горохов", dateFormat.parse("MAY 1 2012"));

        return map;


        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator itr = map.entrySet ().iterator();

        Date dt;
        while (itr.hasNext()) {
            Map.Entry pair = (Map.Entry) itr.next();
            dt = (Date) pair.getValue();
            if (dt.getMonth()>=5 && dt.getMonth()<=7)
                itr.remove();
        }

        String key;
        for(Map.Entry entry: map.entrySet()) {
            key = entry.getKey().toString();
            dt = (Date) entry.getValue();
            System.out.println(key+"  "+dt);
        }
        return;

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> hm = (HashMap<String, Date>) createMap();
        removeAllSummerPeople (hm);
    }
}
