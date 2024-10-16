package com.example.demo;


public class BaseballPlayer {

  private Integer id;
  private String name;
  private String position;
  private double battingAverage;

  // 생성자
  public BaseballPlayer(Integer id, String name, String position, double battingAverage) {
    this.id = id;
    this.name = name;
    this.position = position;
    this.battingAverage = battingAverage;
  }

  // Getter
  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public double getBattingAverage() {
    return battingAverage;
  }

  // toString 메서드 오버라이드
  @Override
  public String toString() {
    return "ID: " + id + ", Name: " + name + ", Position: " + position + ", Batting Average: "
               + battingAverage;
  }
}
