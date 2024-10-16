package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoApplication {

  public static void main(String[] args) {
    Member[] members = {
        new Member(1, "Bany", 12, "b@ex.com"),
        new Member(2, "Aany", 12, "b@ex.com")
    };

    Member[] members2 = new Member[]{
        new Member(1, "Cany", 13, "b@ex.com"),
        new Member(2, "Tany", 12, "t@ex.com")
    };

    Product[] products = {
        new Product(1, "mobile", 12.2, "스마트폰"),
        new Product(2, "monitor", 13.3, "모니터")
    };

    Product[] products2 = new Product[]{
        new Product(1, "mouse", 14.4, "마우스"),
        new Product(2, "keyboard", 15.2, "키보드")
    };

    Car[] cars = {
        new Car(1, "Benz", 12),
        new Car(3, "Audi", 15)
    };

    Car[] cars2 = new Car[]{
        new Car(2, "Pony", 14),
        new Car(1, "Pony", 24)
    };

    Excercise[] excercises = {
        new Excercise(1, "Running", "달리기"),
        new Excercise(2, "Yoga", "요가")
    };

    Excercise[] excercises2 = new Excercise[]{
        new Excercise(1, "Running", "달리기"),
        new Excercise(2, "Boxing", "복싱슉슉")

    };

    List<String> teams = new ArrayList<>(Arrays.asList("스미스", "해리", "론"));
    teams.get(1);
    teams.add("포피");
    teams.set(2, "린다");
    teams.remove(0);
    System.out.println(teams);

    teams.sort(Comparator.naturalOrder());
    /* 기본 정렬 순서 : 숫자는 오름차순, 문자열은 알파벳순.
     * 정렬하려는 객체가 Comparable 인터페이스를 구현해야 한다.
     * String, Integer와 같은 기본 타입은 이미 Comparable 인터페이스를 구현하고 있다.
     */
    teams.contains("만다린"); // 포함 여부 확인
    System.out.println(teams.contains("만다린")); // true, false
  }


}
