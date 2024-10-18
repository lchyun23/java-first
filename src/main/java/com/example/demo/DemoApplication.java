package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DemoApplication {

  public static void main(String[] args) {
    Member[] members1 = {
        new Member(1, "Any", 12, "a@ex.com"),
        new Member(2, "Bny", 12, "b@ex.com")
    };
    System.out.println(members1.getClass());
    /* class [Lcom.example.demo.Member;
     * com.example.demo.Member 클래스의 객체 배열을 의미한다.
     */

    Member[] members2 = new Member[]{
        new Member(1, "Cny", 13, "c@ex.com"),
        new Member(2, "Dny", 12, "d@ex.com")
    };

    // 길이 기반 Array 선언
    Member[] members3 = new Member[3]; // Member 타입의 배열을 길이 3으로 초기화하여 생성하였다.

    // 선언한 members3 객체 배열에 값 넣기
    members3[0] = new Member(1, "Eny", 15, "e@ex.com");
    members3[1] = new Member(2, "Fny", 18, "f@ex.com");
    members3[2] = new Member(3, "Gny", 20, "g@ex.com");

    System.out.println("members3 프린트: " + members3);
    /* 출력값: [Lcom.example.demo.Member;@13a5fe33
        - 배열 객체의 참조 값(메모리 주소)을 나타내는 문자열 표현
     */

    System.out.println("members3 0번째: " + members3[0]);

    // for문을 사용해서 출력해보기
    for (int i = 0; i < members3.length; i++) {
      System.out.println("0-1. members3[" + i + "] : " + Arrays.toString(members3));
    }

    // enhanced for문 사용해보기

    Product[] products = {
        new Product(1, "mobile", 12.2, "스마트폰"),
        new Product(2, "monitor", 13.3, "모니터")
    };

    // for문으로 products 출력하기
    for (int i = 0; i < products.length; i++) {
      System.out.println("0-2. products[" + i + "] : " + Arrays.toString(products));
    }

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

    // Member, Product 같은걸 했으면 좋겠어요
    List<String> teams = new ArrayList<>(Arrays.asList("스미스", "해리", "론"));

    List<Member> member_list = new ArrayList<>(Arrays.asList(members3));
    System.out.println("0-3. members3를 넣은 member_list 출력 : " + member_list);

    List<Member> member_list2 = new ArrayList<>(
        Arrays.asList(
            new Member(1, "Neny", 17, "ex@ex.com"),
            new Member(2, "Maly", 16, "re@ex.com"),
            new Member(3, "Kaly", 18, "re@ex.com"),
            new Member(4, "Laly", 16, "re@ex.com")
        ));

    List<Product> product_list2 = new ArrayList<>(
        Arrays.asList(new Product(1, "fork", 22.0, "포크"))
    );

    List<Car> car_list2 = new ArrayList<>(
        Arrays.asList(new Car(1, "porsche", 22))
    );

    System.out.println("1. teams[0] 출력: " + teams.get(0));

    teams.add("포피");
    System.out.println("2. teams add 확인: " + teams);

    teams.set(2, "린다");
    System.out.println("3. teams[2] 재설정: " + teams);

    teams.remove(0);
    System.out.println("4. teams[0] 삭제: " + teams);

    System.out.println("5. teams sort: " + teams);

    // (1) 람다 기준             : (o1, o2) -> { return o1.getAge() - o2.getAge() }
    member_list2.sort((Member m1, Member m2) -> {
      return Integer.compare(m2.getAge(), m1.getAge());
    });

    // sort된 거를 확인해보려면?
    System.out.println("람다 sort : " + member_list2);

    // (2+) 함수형 인터페이스 기준  : new Comparator {  @Override Integer compare(o1, o2) { return ,,, }  }
    member_list2.sort(new Comparator<Member>() {
      @Override
      public int compare(Member m1, Member m2) {
        return Integer.compare(m1.getAge(), m2.getAge());
      }
    });
    System.out.println("함수형 인터페이스 sort : " + member_list2);

    teams.sort(Comparator.naturalOrder());
    /* 기본 정렬 순서 : 숫자는 오름차순, 문자열은 알파벳순.
     * 정렬하려는 객체가 Comparable 인터페이스를 구현해야 한다.
     * String, Integer 와 같은 기본 타입은 이미 Comparable 인터페이스를 구현하고 있다.
     */

//    List<String> teams = new ArrayList<>(Arrays.asList("스미스", "해리", "론"));

    teams.contains("만다린"); // 포함 여부 확인
    System.out.println("6. 만다린이 포함됐는가?: " + teams.contains("만다린")); // true, false

    System.out.println("7. arraylist의 0부터 1까지 범위만큼 출력: " + teams.subList(0, 2));

    teams.clear();
    System.out.println("8. teams.clear() 확인: " + teams);

    System.out.println("9. teams 비었나요?: " + teams.isEmpty());

    teams.add("키토");
    teams.add("피카츄");
    teams.add("에디");
    teams.add("뽀로로");
    System.out.println("9-1. teams 추가: " + teams);

    System.out.println("9-2. teams 개수: " + teams.size());

    List<Member> member1 = new ArrayList<>(Arrays.asList(
        new Member(10, "ari", 20, "ari@ex.com"),
        new Member(11, "nara", 22, "nara@ex.com")
    ));
    System.out.println("10. Member 타입의 member1 리스트 생성: " + member1);
    // 출력 포매팅을 쓴다면?
    for (Member member : member1) {
      /* 향상된 for문 형식
       * for (자료형 변수명 : 배열명) { 문장 }
       * 언제 쓰나? - ArrayList 원소 출력
       */
      System.out.println(
          String.format("10-1. member1 출력 포매팅 적용: " + "Member[id=%d, name=%s, age=%d, email=%s]",
              member.getId(), member.getName(),
              member.getAge(), member.getEmail()
          )
      );
    }

    List<Boolean> tfs = new ArrayList<>(Arrays.asList(true, false, true, false));
    System.out.println("11. Boolean type 출력: " + tfs);
    System.out.println("12. tfs 개수: " + tfs.size());
    System.out.println("13. tfs true 포함 여부: " + tfs.contains(true));

//    tfs.set(1, 0); - 타입이 불리언이므로 불리언만 들어가야 한다.
    System.out.println("14. tfs 출력: " + tfs);
    tfs.sort(Boolean::compareTo);
    System.out.println("15. tfs tfs.sort(Boolean::compareTo) 한 이후: " + tfs);

    member1.subList(0, 2);
    System.out.println("17. member1 부분 출력: ");

    member1.remove(0);
    System.out.println("16. 0번 삭제 후 member1: " + member1);

    member1.contains(new Member(1, "ari", 20, "ari@ex.com"));
    System.out.println(
        "18. member1 포함: " + member1.contains(new Member(1, "ari", 20, "ari@ex.com")));

    System.out.println("19. member1 크기: " + member1.size());

    member1.clear();
    System.out.println("20. member1 리셋: " + member1);

    member1.isEmpty();
    System.out.println("21. member1 검사: " + member1.isEmpty());

    List<Product> product_link = new LinkedList<Product>(Arrays.asList(
        new Product(1, "pencil", 2.3, "연필"),
        new Product(2, "pen", 3.5, "볼펜"),
        new Product(3, "ruler", 3.3, "자")
    ));

    System.out.println("22. LinkedList get: " + product_link.get(2));

    product_link.add(new Product(4, "spoon", 2.6, "숟가락"));
    System.out.println("23. LinkedList add: " + product_link);

    product_link.set(1, new Product(11, "editor", 2.7, "편집기"));
    System.out.println("24. LinkedList set: " + product_link);

    product_link.remove(3);
    System.out.println("25. LinkedList remove: " + product_link);

    System.out.println("26. LinkedList subList: " + product_link.subList(0, 2));

    product_link.sort(new Comparator<Product>() {
      @Override
      public int compare(Product p1, Product p2) {
        return p1.getDescription().compareTo(p2.getDescription());
      }
    });
    System.out.println("27. LinkedList description 기준 sorting: " + product_link);

    System.out.println(
        "28. LinkedList Container: " + product_link.contains(new Product(1, "pencil", 2.4, "없음")));

    System.out.println("29. LinkedList isEmpty: " + product_link.isEmpty());

    System.out.println("30. LinkedList size: " + product_link.size());

    product_link.clear();
    System.out.println("31. LinkedList clear: " + product_link);

    Set<Excercise> excerciseSet = new HashSet<Excercise>(Arrays.asList(
        new Excercise(1, "walking", "걷기"),
        new Excercise(2, "swimming", "수영")
    ));

    System.out.println("32. HashSet print: " + excerciseSet);
    System.out.println("32-1. HashSet 자료형 확인: " + excerciseSet.getClass());

    excerciseSet.add(new Excercise(3, "rowing", "조정"));
    System.out.println("33. HashSet add : " + excerciseSet);

    excerciseSet.remove(new Excercise(2, "swimming", "수영"));
    System.out.println("34. HashSet remove: " + excerciseSet);

  }
}
