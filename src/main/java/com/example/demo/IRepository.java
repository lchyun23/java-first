package com.example.demo;
// 메서드 4개 : create, read, update, delete
// 메서드에 public abstract 적고 반환값 뭐할지, parameter 뭐할지 생각해보기.
// 클래스의 형상 = 인터페이스
// IRepository라는 형상을 가진 MemberRepository class를 만든다.

public interface IRepository {
    public abstract Member create(int id, String name, int age, String email);

    public abstract Member read(int id);

    public abstract Member update(int id, Member member);

    public abstract Member delete(int id);

}
