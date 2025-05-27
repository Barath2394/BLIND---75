package com.Barath.OOPs.ClassAndObject;
class A {
    final int valA = 10;
    void display() {
        System.out.println("A : " + valA);
    }
}
class B extends A{
    int valB = 20;
    void display() {
        System.out.println("A : " + valB);
    }
}
public class FinalExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
