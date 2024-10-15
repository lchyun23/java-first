package com.example.demo;

public class ArrayMember {

  public static void main(String[] args) {
    // 배열 선언 (고정 크기 3)
    Member[] members = new Member[3];

    // 배열에 Member 객체 추가
    members[0] = new Member(1, "Alice", 34, "a@ex.com");
    members[1] = new Member(2, "Bob", 33, "b@ex.com");
    members[2] = new Member(3, "Chan", 40, "c@ex.com");
  }
}
