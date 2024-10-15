package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    ArrayWeeks arrayWeeks = new ArrayWeeks();
    arrayWeeks.initializeWeeks(); // 배열 초기화
    arrayWeeks.printWeeks(); // 배열 값 출력
  }

}
