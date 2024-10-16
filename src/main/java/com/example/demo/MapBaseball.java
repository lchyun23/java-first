package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MapBaseball {

  private Map<Integer, BaseballPlayer> playerMap;

  // 생성자
  public MapBaseball() {
    playerMap = new HashMap<>(); // HashMap 초기화
  }

  // 선수 추가 메서드
  public void addPlayer(BaseballPlayer player) {
    playerMap.put(player.getId(), player); // ID를 키로, Player 객체를 값으로 저장
    System.out.println(player.getName() + "선수가 추가되었습니다.");
  }

  // 선수 삭제 메서드
  public void removePlayer(Integer id) {
    BaseballPlayer removedPlayer = playerMap.remove(id); // 키를 사용해 선수 삭제
    if (removedPlayer != null) {
      System.out.println(removedPlayer.getName() + "선수가 삭제되었습니다.");
    } else {
      System.out.println("ID " + id + "를 가진 선수를 찾을 수 없습니다.");
    }
  }

  // 특정 ID의 선수 조회 메서드
  public void displayPlayer(Integer id) {
    BaseballPlayer player = playerMap.get(id);
    if (player != null) {
      System.out.println("선수 정보: " + player);
    } else {
      System.out.println("ID " + id + "를 가진 선수를 찾을 수 없습니다.");
    }
  }

  // 모든 선수 조회 메서드
  public void displayAllPlayers() {
    if (playerMap.isEmpty()) {
      System.out.println("등록된 선수가 없습니다");
    } else {
      System.out.println("야구 선수 목록");
      for (BaseballPlayer player : playerMap.values()) {
        System.out.println(player);
      }
    }
  }

  // 메인 메서드
  public static void main(String[] args) {
    MapBaseball team = new MapBaseball();

    // 선수 추가
    team.addPlayer(new BaseballPlayer(1, "박찬호", "투수", 0.256));
    team.addPlayer(new BaseballPlayer(2, "이승엽", "타자", 0.306));
    team.addPlayer(new BaseballPlayer(3, "류현진", "투수", 0.275));

    // 모든 선수 목록 출력
    team.displayAllPlayers();

    // 특정 선수 조회
    team.displayPlayer(2);

    // 선수 삭제
    team.removePlayer(2);

    // 삭제 후 모든 선수 목록 출력
    team.displayAllPlayers();
  }
}
