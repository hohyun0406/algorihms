package com.rod.api.team.repository;

import com.rod.api.team.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> , TeamDAO{

//    @Query("select new map(t.teamName as teamName) from Team t order by t.teamName")
//    List<Map<String, Object>> problem1();
//
//    @Query("select new map(t.teamName as teamName, t.stadium.stadiumName as stadiumName) " +
//            "from Team t ")
//    List<Map<String, Object>> problem11();
//
//    @Query("select new map(t.teamName as teamName, p.playerName as playerName, p.position as position ) " +
//            "from Team t join t.player p " +
//            "where t.id in (:team1, :team2) and p.position = :position " +
//            "order by t.teamName, p.playerName")
//    List<Map<String, Object>> problem10(@Param("team1") String team1, @Param("team2") String team2, @Param("position") String position);
//
//    @Query("select new map(p.height as height, t.teamName as teamName, p.playerName as playerName) " +
//            "from Team t join t.player p " +
//            "where t.id in (:team1, :team2) and cast(p.height as double) between :height1 and :height2 " +
//            "order by p.height, t.teamName, p.playerName")
//    List<Map<String, Object>> problem12(@Param("team1") String team1, @Param("team2") String team2, @Param("height1") double height1, @Param("height2") double height2);
//
//
//    @Query("select new map(t.teamName as teamName, p.playerName as playerName) " +
//            "from Team t join t.player p " +
//            "where p.position = '' " +
//            "order by t.teamName, p.playerName")
//    List<Map<String, Object>> problem13();
//
//
//    @Query("select new map(t.id as id, t.teamName as teamName, ROUND(AVG(cast(p.height as double)), 2) as avgHeight) " +
//            "from Team t join t.player p " +
//            "where p.height != ' ' " +
//            "group by t.id " +
//            "having ROUND(AVG(cast(p.height as double)), 2) < :height")
//    List<Map<String, Object>> problem19(@Param("height") double height);
}
