package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
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
        new Product(1, "mouse", 14.4, "마우스")
    };

    Car[] cars = {
        new Car(1, "Benz", 12),
        new Car(2, "Pony", 14),
        new Car(3, "Audi", 15)
    };

    Car[] cars2 = new Car[]{
        new Car(1, "Pony", 24)
    };

    Excercise[] excercises = {
        new Excercise(1, "Running", "달리기"),
        new Excercise(2, "Yoga", "요가"),
        new Excercise(3, "Boxing", "복싱슉슉")
    };

    Excercise[] excercises2 = new Excercise[]{
        new Excercise(1, "Running", "달리기")
    };

    List<String> teams = new ArrayList<>(Arrays.asList("스미스", "해리", "론"));
    teams.get(1);
    teams.add("포피");
    teams.set(2, "린다");
    teams.remove(0);

    teams.sort(Comparator.naturalOrder());
    /* 기본 정렬 순서 : 숫자는 오름차순, 문자열은 알파벳순.
     * 정렬하려는 객체가 Comparable 인터페이스를 구현해야 한다.
     * String, Integer와 같은 기본 타입은 이미 Comparable 인터페이스를 구현하고 있다.
     */
    teams.contains("포피");
    teams.clear(); // 리셋
    teams.isEmpty(); // 검사
    teams.size();

    // 기존의 배열을 리스트로 만든다.
    List<Member> member_list = Arrays.asList(members);
    List<Product> product_list = Arrays.asList(products);
    List<Car> car_list = Arrays.asList(cars);
    List<Excercise> excercise_list = Arrays.asList(excercises);

    // 리스트 조회
//    System.out.println("product_list 조회 : " + product_list.get(2));
//    System.out.println("car_list 조회: " + car_list.get(0));
//    System.out.println("exercise_list 조회 " + excercise_list.get(0));

    // list 추가하려면 바꿔줘야 한다. 추가 기능
    List<Member> members_list = new ArrayList<>(Arrays.asList(members));
    List<Product> products_list = new ArrayList<>(Arrays.asList(products));
    List<Car> cars_list = new ArrayList<>(Arrays.asList(cars));
    List<Excercise> excercises_list = new ArrayList<>(Arrays.asList(excercises));

    // list 추가하려면 바꿔줘야 한다. 추가 기능
    members_list.add(new Member(3, "Dany", 17, "d@ex.com"));
    products_list.add(new Product(4, "modem", 12.8, "모뎀"));
    cars_list.add(new Car(4, "Kia", 16));
    excercises_list.add(new Excercise(4, "Swimming", "수영슉슉"));

    System.out.println(members_list);
    System.out.println(excercises_list);

    // LinkedList가 삽입/삭제가 우수. 만들어보자.
    List<Member> members_list_link = new LinkedList<>(Arrays.asList(members));
    List<Product> product_list_link = new LinkedList<>(Arrays.asList(products));
    List<Car> car_list_link = new LinkedList<>(Arrays.asList(cars));
    List<Excercise> excercise_list_link = new LinkedList<>(Arrays.asList(excercises));

    // LinkedList 추가
    members_list_link.add(new Member(4, "Eany", 18, "e@ex.com"));
    product_list_link.add(new Product(5, "speaker", 12.3, "스피커"));
    car_list_link.add(new Car(5, "BMW", 22));
    excercise_list_link.add(new Excercise(5, "Tennis", "테니스 팡팡"));

    // 확인해보기
//    System.out.println(members_list_link);
//    System.out.println(product_list_link);
//    System.out.println(car_list_link);
//    System.out.println(excercise_list_link);

    // LinkedList 삭제
    members_list_link.remove(2);
    product_list_link.remove(1);
    car_list_link.remove(0);
    excercise_list_link.remove(2);

    // LinkedList set
    members_list_link.set(0, new Member(33, "Nany", 19, "na@ex.com"));
    product_list_link.set(0, new Product(11, "headphone", 21.1, "헤드폰"));
//    System.out.println(members_list_link);
//    System.out.println(product_list_link);

    // LinkedList subList
    car_list_link.subList(0, 1);
    System.out.println(car_list_link);

    // HashMap

    // TreeMap

    // LinkedHashMap

  }
}
