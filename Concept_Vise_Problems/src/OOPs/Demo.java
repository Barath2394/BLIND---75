package com.Barath.OOPs;
class Human {
    String name;
    int age;
    static int population = 1000;
}
public class Demo {
    public static void main(String[] args) {
        Human barath = new Human();
        barath.name = "Barath";
        Human madhan = new Human();
        madhan.name = "Madhan";
        barath.population = 1001;
        System.out.println(barath.name);
        System.out.println(madhan.name);
        System.out.println("Population for barath : " + barath.population);
        System.out.println("Population for madhan : " + madhan.population);
//        Since the population is common to all the object , it can access through the class name Itself.
        System.out.println(Human.population);
    }
}
