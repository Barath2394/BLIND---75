package com.Barath.OOPs;
abstract class Bird {
    abstract void fly();
    abstract void eat();
    void display() {
        System.out.println("This is an abstract class Bird");
    }
}
class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle can fly higher..");
    }
    public void eat() {
        System.out.println("Eagle eats snake");
    }
}
class Hen extends Bird {
    public void fly() {
        System.out.println("Hen can fly some what..");
    }
    public void eat() {
        System.out.println("Hen eats rice");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Bird hen = new Hen();
        hen.fly();
        hen.eat();
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.eat();
    }
}
