package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    MemberRepository memberRepository = new MemberRepository();

    // Member 객체 3개 생성
    Member member1 = new Member(1, "park", 30, "park@ex.com");
    Member member2 = new Member(2, "lee", 22, "lee@ex.com");
    Member member3 = new Member(3, "kim", 17, "kim@ex.com");

    memberRepository.create(member1);
    memberRepository.create(member2);
    memberRepository.create(member3);
    System.out.println("3개 객체 생성 완료");

    // 1개 삭제
    memberRepository.delete(2);
    System.out.println("2번 삭제 완료");

    // 1개 업데이트
    Member updatedMember = new Member(1, "choi", 18, "choi@ex.com");
    memberRepository.update(1, updatedMember);
    System.out.println("4번 객체 생성 완료");

    // 2개 Member 객체 각각 개별 조회
    Member readMember1 = memberRepository.read(1);
    System.out.println(readMember1);
    System.out.println("1번 객체 조회");

    Member readMember3 = memberRepository.read(3);
    System.out.println(readMember3);
    System.out.println("3번 객체 조회");

    // 모든 멤버 객체 보여주기
    memberRepository.displayAllMembers();
  }
}
