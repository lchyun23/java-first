package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBaseball {

  private List<BaseballPlayer> playerList;

  // 생성자
  public ArrayListBaseball() {
    playerList = new ArrayList<>(); // ArrayList 초기화
  }

  // 선수 추가 메서드
  public void addPlayer(BaseballPlayer player) {
    playerList.add(player);
    System.out.println(player.getName() + "선수가 추가되었습니다.");
  }

  // 선수 삭제 메서드
  public void removePlayer(Integer id) {
    BaseballPlayer playerToRemove = null;
    for (BaseballPlayer player : playerList) {
      if (player.getId() == id) {
        playerToRemove = player;
        break;
      }
    }
    if (playerToRemove != null) {
      playerList.remove(playerToRemove);
      System.out.println(playerToRemove.getName() + "선수가 삭제되었습니다.");
    } else {
      System.out.println("ID " + id + "를 가진 선수를 찾을 수 없습니다.");
    }
  }

  // 선수 조회 메서드
  public void displayPlayers() {
    if (playerList.isEmpty()) {
      System.out.println("등록된 선수가 없습니다.");
    } else {
      System.out.println("야구 선수 목록:");
      for (BaseballPlayer player : playerList) {
        System.out.println(player);
      }
    }
  }

  // 메인 메서드
  public static void main(String[] args) {
    ArrayListBaseball team = new ArrayListBaseball();

    // 선수 추가
    team.addPlayer(new BaseballPlayer(1, "박찬호", "투수", 0.256));
    team.addPlayer(new BaseballPlayer(2, "이승엽", "타자", 0.301));
    team.addPlayer(new BaseballPlayer(3, "류현진", "투수", 0.275));

    // 선수 목록 출력
    team.displayPlayers();

    // 선수 삭제
    team.removePlayer(2);

    // 삭제 후 선수 목록 출력
    team.displayPlayers();
  }
}
