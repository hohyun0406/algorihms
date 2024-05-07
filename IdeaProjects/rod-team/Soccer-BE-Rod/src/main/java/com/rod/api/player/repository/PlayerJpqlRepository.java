package com.rod.api.player.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface PlayerJpqlRepository{

    @Query("SELECT DISTINCT new map(p.position as position) from Player p")
    List<Map<String, Object>> getPractice2();

    @Query("select new map(p.playerName as playerName) " +
            "from Player p " +
            "where p.team.id = :teamId and p.position = :position")
    List<Map<String, Object>> getPractice4(@Param("teamId") String teamId, @Param("position") String position);

    @Query("select new map(p.playerName as playerName)  from Player p where p.playerName like concat(:playerName,'%') and p.height >= :height and p.team.id = (select t.id from Team t where t.regionName = :regionName)")
    List<Map<String, Object>> getFiveOne(@Param("playerName") String playerName, @Param("height") String height, @Param("regionName") String regionName);

    @Query("select new map(p.playerName as playerName) from Player p where p.team.id = :teamId and p.playerName like concat(:playerName,'%') and p.height >= :height")
    List<Map<String, Object>> getPractice5(@Param("teamId") String teamId, @Param("playerName") String playerName, @Param("height") String height);


    @Query("select new map(p.id as id, p.playerName as playerName, p.ePlayerName as ePlayerName,p.nickname as nickname,p.joinYyyy as joinYyyy, " +
            "p.position as position, p.backNo as backNo, p.nation as nation, p.birthDate as birthDate, p.solar as solar, p.height as height, p.weight as weight, p.team.id as teamId) " +
            "from Player p " +
            "where p.team.id in (select t.id from Team t where t.teamName = :teamName1 or t.teamName = :teamName2) " +
            "and p.position = :position " +
            "and p.height between :min and :max")
    List<Map<String, Object>> getPractice6(@Param("teamName1") String teamName1, @Param("teamName2") String teamName2,
                                                                  @Param("position") String position, @Param("min") String min,
                                                                  @Param("max") String max);
    @Query("select new map(p.id as id, p.playerName as playerName, p.ePlayerName as ePlayerName, p.nickname as nickname ,p.joinYyyy as joinYyyy," +
            " p.position as position, p.backNo as backNo, p.nation as nation, p.birthDate as birthDate, p.solar as solar, p.height as height, p.weight as weight, p.team.id as teamId)  " +
            "from Player p where p.position = :position and p.team.id = (select t.id from Team t where t.regionName = :regionName)")
    List<Map<String, Object>> getPractice7(@Param("position") String position, @Param("regionName") String regionName);

    @Query("select p.id as id, p.playerName as playerName, p.ePlayerName as ePlayerName,p.nickname as nickname,p.joinYyyy as joinYyyy, " +
            "p.position as position, p.backNo as backNo, p.nation as nation, p.birthDate as birthDate, p.solar as solar, p.height as height, p.weight as weight, p.team.id as teamId " +
            "from Player p order by p.id limit 5")
    List<Map<String, Object>> getPractice18();

    //문제 8
    @Query("select new map(p.playerName as playerName, " +
            "ifnull(nullif(p.height,''),'0') as height, " +
            "ifnull(nullif(p.weight,''),'0') as weight) " +
            "from Player p where p.team.id = (select t.id from Team t where t.regionName = :regionName)  order by p.height,p.weight desc")
    List<Map<String, Object>> getPractice8(@Param("regionName") String regionName);

    //문제 9
    @Query("select new map(p.playerName as playerName, p.position as position, " +
            "concat(ifnull(nullif(p.height,''),'0'),'cm') as height, " +
            "concat(ifnull(nullif(p.weight,''),'0'),'kg') as weight, " +
            "ifnull(cast(nullif(cast(p.weight as int) / (cast(p.height as int)/100 * cast(p.height as int)/100), 0) as string), 'NONE') as bmi) " +
            "from Player p " +
            "where p.team.id = (select t.id from Team t where t.regionName = :regionName) " +
            "order by p.playerName desc")
    List<Map<String, Object>> getPractice9(@Param("regionName") String regionName);

    //문제 20
    @Query("select new map((select t.teamName from Team t where t.id = p.team.id) as teamName, " +
            "p.playerName as playerName, " +
            "p.backNo as backNo) " +
            "from Player p " +
            "where p.position = :position")
    List<Map<String, Object>> getPractice20(@Param("position") String position);

    //문제 21
    @Query("select (select t.teamName from Team t where t.id = p.team.id) as teamName, " +
            "        p.playerName as playerName, " +
            "        p.backNo as backNo " +
            "from Player p " +
            "order by p.height desc limit 5")
    List<Map<String, Object>> getPractice21();

    //문제 22
    @Query("SELECT p.playerName as playerName, p.height as height, p.team.id as teamId " +
            "FROM Player p " +
            "WHERE cast(p.height as double) < cast((" +
            "SELECT ROUND(AVG(cast(p1.height as double)), 2) " +
            "FROM Player p1 " +
            "WHERE p1.team.id = p.team.id " +
            "GROUP BY p1.team.id) as double)")
    List<Map<String, Object>> getPractice22();
}
