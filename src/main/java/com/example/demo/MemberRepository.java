package com.example.demo;
// 머릿속에 형상, 구현 박자! 둘이 짝꿍이다.
// 형상은 다른 말로 추상이라 한다.

/* 파란색 = Irepository에 있는 메서드를 재정의. 즉 Implements라는 키워드를 사용해서 인터페이스를 구현
* implements = Irepository를 불러서 그 안에 있는 메서드를 재정의 한다.
* */


import java.util.*;

public class MemberRepository implements IRepository {
// MemberRepository는 IRepository를 구현한다.

    // Map<Integer, Member> 필드 추가
    private Map<Integer, Member> memberMap = new HashMap<>();

    @Override
    // 껍데기만 가져왔으므로 알맹이를 쓰기 위해서 new 선언으로 객체 생성.
    public Member create(int id, String name, int age, String email) {
        // 파라미터로 id, name, age, email 넣어서 생성한다.
        Member member = new Member(id, name, age, email);
        // Map에 멤버 추가하기
        memberMap.put(id, member);
        // 생성된 멤버 반환
        return member;
    }

    @Override
    public Member read(int id) {
        // id로 Map에서 멤버를 조회
        return memberMap.get(id);
    }

    @Override
    public Member update(int id, Member member) {
        return null;
    }

    @Override
    public Member delete(int id) {
        return null;
    }
}
