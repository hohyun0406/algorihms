package com.rod.api.stadium.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component //Object 같은거
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
public class StadiumDTO {
    private String id;
    private String stadiumName;
    private String homeTeamId;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;
    private String scheduleId;
    private String teamName;

    public StadiumDTO(String stadiumName, String teamName) {
        this.stadiumName = stadiumName;
        this.teamName = teamName;
    }
}
