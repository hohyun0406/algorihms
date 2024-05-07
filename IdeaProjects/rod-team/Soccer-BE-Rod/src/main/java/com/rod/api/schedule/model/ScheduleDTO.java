package com.rod.api.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
    Long id;
    String stadiumId;
    String scheDate;
    String gubun;
    String hometeamId;
    String awayteamId;
    Integer homeScore;
    Integer awayScore;
    String teamName;
    String awayTeamName;
    String stadiumName;

    public ScheduleDTO(String teamName, String awayTeamName, String stadiumName) {
        this.teamName = teamName;
        this.awayTeamName = awayTeamName;
        this.stadiumName = stadiumName;
    }
}
