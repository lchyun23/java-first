package com.example.demo;

public interface IRepository {

  // Member 객체를 생성
  public abstract Member create(Member entity);

  // id를 기반으로 Member 객체를 읽음
  public abstract Member read(Integer id);

  // id를 기반으로 Member 객체를 업데이트
  public abstract Member update(Integer id, Member entity);

  // id를 기반으로 Member 객체를 삭제
  public abstract void delete(Integer id);
}
