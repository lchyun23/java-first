package com.example.demo;

public class DemoApplication {

  public static void main(String[] args) {
    Member[] members = {
        new Member(1, "Bany", 12, "b@ex.com"),
        new Member(2, "Cany", 13, "b@ex.com")
    };

    Product[] products = {
        new Product(1, "mobile", 12.2, "스마트폰"),
        new Product(2, "monitor", 13.3, "모니터"),
        new Product(3, "mouse", 14.4, "마우스")
    };

    Car[] cars = {
        new Car(1, "Benz", 12),
        new Car(2, "Pony", 14),
        new Car(3, "Audi", 15)
    };

    Excercise[] excercises = {
        new Excercise(1, "Running", "달리기"),
        new Excercise(2, "Yoga", "요가"),
        new Excercise(3, "Boxing", "복싱슉슉")
    };

    //

  }
}
