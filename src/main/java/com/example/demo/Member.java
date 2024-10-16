package com.example.demo;

public class Member extends Human {

  private Integer age;
  private String email;

  // Member 클래스의 생성자
  public Member(Integer id, String name, Integer age, String email) {
    super(id, name); // 부모 클래스 Human의 생성자 호출
    this.age = age;
    this.email = email;
  }

  // Getter
  public Integer getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  // toString : Member 객체의 정보를 문자열로 변환하기 위해서 필요.
  @Override
  public String toString() {
    return "ID=" + getId() + ", Name=" + getName() +
               ", Age=" + age + ", Email=" + email;
  }

}
