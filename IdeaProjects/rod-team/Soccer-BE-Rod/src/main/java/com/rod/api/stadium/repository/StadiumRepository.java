package com.rod.api.stadium.repository;

import com.rod.api.stadium.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long>, StadiumDAO{
    @Query("select new map(sc.scheDate as schedule, " +
            "(select t.teamName from Team t where t.id = sc.hometeamId) as homeTeam, " +
            "s.stadiumName as stadium, " +
            "(select t.teamName from Team t where t.id = sc.awayteamId) as awayTeam) " +
            "from Stadium s join s.schedules sc " +
            "where sc.scheDate = :date")
    List<Map<String, Object>> problem14(@Param("date") String date);

    @Query("select new map (p.playerName as playerName, " +
            "p.position as position, " +
            "concat(t.regionName, '[]', t.teamName) as teamName, " +
            "s.stadiumName as stadium, " +
            "sc.scheDate as schedule )" +
            "from Stadium s " +
            "join schedule sc on s.id = sc.stadium.id " +
            "join Team t on s.homeTeamId = t.id " +
            "join Player p on t.id = p.team.id " +
            "where sc.scheDate = :date and t.teamName = :team and p.position = :position")
    List<Map<String, Object>> problem15(@Param("date") String date, @Param("team") String team, @Param("position") String position);

    @Query("select " +
            "new map(s.stadiumName as stadiumName, sc.scheDate as match_Schedule, " +
            "(select t.teamName from Team t where sc.hometeamId = t.id ) as homeTeamName, " +
            "(select t.teamName from Team t where sc.awayteamId = t.id ) as awayTeamName) " +
            "from Stadium s join s.schedules sc " +
            "where sc.homeScore - sc.awayScore >= cast(:score as int)")
    List<Map<String, Object>> problem16(@Param("score") String score)   ;
    @Query("select new map(s.stadiumName as stadiumName, t.teamName as teamName)" +
            "from Stadium s left join s.team t")
    List<Map<String, Object>> problem17();
}
