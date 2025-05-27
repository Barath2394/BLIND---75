package com.Barath.OOPs.ClassAndObject;
public interface Car {
    void start();
    void stop();
}
class BmwCar implements Car {
    @Override
    public void start() {
        System.out.println("Bmw car is started..");
    }
    public void stop() {
        System.out.println("Bmw car is stopping..");
    }
}
class InterfaceExample {
    public static void main(String[] args) {

    }
}
