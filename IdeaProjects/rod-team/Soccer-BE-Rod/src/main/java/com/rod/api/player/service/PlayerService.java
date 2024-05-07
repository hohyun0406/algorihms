package com.rod.api.player.service;

import java.util.List;
import java.util.Map;

public interface PlayerService{

    List<Map<String, Object>> getPractice2();

    List<Map<String, Object>> getPractice4(String teamId, String position);

//    List<Player> getPlayerByTeamIdAndNameAndHeight();
//
//    List<Player> findFirst5OrderById();

    List<Map<String, Object>> getFiveOne(String playerName, String height, String regionName);
    List<Map<String, Object>> getPractice5(String teamId, String playerName, String height);
    List<Map<String, Object>> getPractice18();
    List<Map<String, Object>> getPractice7(String position, String regionName);

    List<Map<String, Object>> getPractice6(String team1, String team2,String position, String min, String max);

    List<Map<String, Object>> getPractice8(String regionName);

    List<Map<String, Object>> getPractice9(String regionName);

    List<Map<String, Object>> getPractice20(String position);
    List<Map<String, Object>> getPractice21();
}
