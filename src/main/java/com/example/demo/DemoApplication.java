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

        // 길이 기반 Array 선언
        Member[] members3 = new Member[3]; // Member 타입의 배열을 길이 3으로 초기화하여 생성하였다.

        // 선언한 배열에 값 넣기
        members3[0] = new Member(1, "Nany", 15, "n@ex.com");
        members3[1] = new Member(2, "Oany", 18, "m@ex.com");
        members3[2] = new Member(3, "Many", 20, "m@ex.com");

        System.out.println("members3 프린트: " + members3); // 출력값: [Lcom.example.demo.Member;@13a5fe33
        System.out.println("members3 0번째: " + members3[0]);

        // for문을 사용해서 출력해보기
        for (int i = 0; i < members3.length; i++) {
//      System.out.println("members3[" + i + "]= " + members3); // 주소값 출력.
            System.out.println("0-1. members3[" + i + "] : " + Arrays.toString(members3));
        }

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

        Set<Car> cars1 = new HashSet<Car>(
            Arrays.asList(
                new Car(1, "테슬라", 10),
                new Car(2, "아우디", 12),
                new Car(3, "현대", 14)
            )
        );
        System.out.println("16. HashSet cars1 : " + cars1);

        cars1.add(new Car(4, "소나타", 20));
        System.out.println("17. HashSet cars1 출력: " + cars1);
        // 17. HashSet cars1 출력: Car(id=4, name=소나타, price=20) - id 4번이 가장 먼저 출력된다.
        cars1.add(new Car(4, "소나타", 20));
        System.out.println("18. HashSet cars1 중복값 추가: " + cars1);
        // 오류가 나진 않는다. 그러나 추가되지도 않는다.

    }
}
