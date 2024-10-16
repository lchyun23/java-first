package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository implements IRepository {

  private Map<Integer, Member> memberMap = new HashMap<>();

  @Override
  public Member create(Member entity) {
    memberMap.put(entity.getId(), entity);
    return entity;
  }

  @Override
  public Member read(Integer id) {
    return memberMap.get(id);
  }

  @Override
  public Member update(Integer id, Member entity) {
    if (memberMap.containsKey(id)) {
      memberMap.put(id, entity);
      return entity;
    } else {
      return null;
    }
  }

  @Override
  public void delete(Integer id) {
    Member removedMember = memberMap.remove(id);
  }

  // 모든 Member 객체 조회 메서드
  public void displayAllMembers() {
    if (memberMap.isEmpty()) {
      System.out.println("등록 선수 없음");
    } else {
      // 선수 있을 때 한 명씩 보여주기
    }
    for (int i = 0; i < memberMap.size(); i++) {
      Member member = memberMap.get(i);
      System.out.println(
          "ID =" + member.getId() + ", Name=" + member.getName() + ", Age=" + member.getAge()
              + ", Email=" + member.getEmail());
    }
  }
}
