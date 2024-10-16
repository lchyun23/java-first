package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMember {

  public static void main(String[] args) {
    // 배열 만들기
    Member[] members1 = {
        new Member(1, "Bob", 22, "b@ex.com"),
        new Member(2, "Cany", 34, "c@ex.com")
    };

    // 배열 만들기
    Member[] members2 = {
        new Member(3, "Dany", 12, "b@ex.com"),
        new Member(4, "Eany", 14, "b@ex.com")
    };

    // 배열 만들기
    Member[] members3 = {
        new Member(5, "Fany", 16, "b@ex.com")
    };

    // 배열 만들기
    Member[] members4 = new Member[]{
        new Member(6, "Hany", 17, "b@ex.com"),
        new Member(7, "Kkany", 10, "b@ex.com")
    };

    // 배열 만들기
    Member[] members5 = {
        new Member(8, "Xany", 20, "b@ex.com")
    };

    // ArrayList
//    List<Member> member_list = Arrays.asList(
//        new Member(1, "Bob", 12, "b@ex.com"),
//        new Member(2, "An", 23, "c@ex.com")
//    );

    Member[] membersArray = {
        new Member(1, "Bob", 12, "b@ex.com"),
        new Member(2, "An", 34, "b@ex.com")
    };

    // 생성된 membersArray를 리스트로 변환
    List<Member> memberList = Arrays.asList(membersArray);
    List<Member> memberList2 = Arrays.asList(membersArray);
    List<Member> memberList3 = Arrays.asList(membersArray);
    List<Member> memberList4 = Arrays.asList(membersArray);
    List<Member> memberList5 = Arrays.asList(membersArray);

    // 동적으로 크기를 변경하려면?
    List<Member> memberList6 = new ArrayList<>(Arrays.asList(
        new Member(1, "Bob", 12, "b@ex.com"),
        new Member(2, "An", 23, "b@ex.com")
    ));

    List<Member> memberlist7 = new ArrayList<>(Arrays.asList(
        new Member(3, "Bob", 23, "b@ex.com")
    ));

    List<Member> memberlist8 = new ArrayList<>(Arrays.asList(
        new Member(8, "Bob", 12, "b@ex.com")
    ));
  }
}
