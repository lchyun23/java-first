package com.example.demo;

public interface IRepository {

  public abstract Member create(Member entity);

  public abstract Member read(Integer id);

  public abstract Member update(Integer id, Member entity);

  public abstract void delete(Integer id);
}
