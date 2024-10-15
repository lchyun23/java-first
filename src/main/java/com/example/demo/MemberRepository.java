package com.example.demo;

public class MemberRepository implements IRepository {

  @Override
  public Member create(Member entity) {
    Member member = new Member(id, name, age, email);
    return member;
  }

  @Override
  public Member read(Integer id) {
    return null;
  }

  @Override
  public Member update(Integer id, Member entity) {
    return null;
  }

  @Override
  public void delete(Integer id) {
    System.out.println("삭제가 완료되었습니다.");
  }
}
