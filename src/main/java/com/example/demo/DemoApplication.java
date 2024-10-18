package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // Member, Product 같은걸 했으면 좋겠어요
    List<String> teams = new ArrayList<>(Arrays.asList("스미스", "해리", "론"));

    System.out.println("1. teams[0] 출력: " + teams.get(0));

    teams.add("포피");
    System.out.println("2. teams add 확인: " + teams);

    teams.set(2, "린다");
    System.out.println("3. teams[2] 재설정: " + teams);

    teams.remove(0);
    System.out.println("4. teams[0] 삭제: " + teams);

    // (1) 람다 기준             : (o1, o2) -> { return o1.getAge() - o2.getAge() }
    // (2+) 함수형 인터페이스 기준  : new Comparator {  @Override Integer compare(o1, o2) { return ,,, }  }
    teams.sort(Comparator.naturalOrder());
    /* 기본 정렬 순서 : 숫자는 오름차순, 문자열은 알파벳순.
     * 정렬하려는 객체가 Comparable 인터페이스를 구현해야 한다.
     * String, Integer 와 같은 기본 타입은 이미 Comparable 인터페이스를 구현하고 있다.
     */

    /* System.out.println(teams.sort(Comparator.naturalOrder()); 하면 오류난다.
    teams.sort(Comparator.naturalOrder() 의 반환값이 void 이기 때문이다.
    리스트를 정렬만할 뿐 정렬된 리스트를 반환하지 않는다. 반환값이 없는 것을 print하려고 하기 때문에 오류가 난다.
     */
    System.out.println("5. teams sort: " + teams);

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
    System.out.println("10. Member 타입의 member1 생성: " + member1);
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

    Set<Car> cars1 = new HashSet<Car>(
        Arrays.asList(
            new Car(1, "테슬라", 10),
            new Car(2, "아우디", 12),
            new Car(3, "현대", 14)
        )
    );
    System.out.println("16. TreeSet cars1 : " + cars1);

    cars1.add(new Car(4, "소나타", 20));
    System.out.println("17. HashSet cars1 출력: " + cars1);
    // 17. HashSet cars1 출력: Car(id=4, name=소나타, price=20) - id 4번이 가장 먼저 출력된다.
    cars1.add(new Car(4, "소나타", 20));
    System.out.println("18. HashSet cars1 중복값 추가: " + cars1);
    // 오류가 나진 않는다. 그러나 추가되지도 않는다.

  }


}
