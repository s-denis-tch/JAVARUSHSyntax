package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.print("Cat was destroyed");
    }
    //напишите тут ваш код

}

class Dog {
    //напишите тут ваш код
    @Override
    protected void finalize() throws Throwable {
        System.out.print("Dog was destroyed");
    }
}
