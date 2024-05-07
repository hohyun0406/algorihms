package com.rod.api.schedule.model;

import com.rod.api.stadium.model.Stadium;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sche_date")
    private String scheDate;

    private String gubun;

    @Column(name = "hometeam_id")
    private String hometeamId;

    @Column(name = "awayteam_id")
    private String awayteamId;

    @Column(name = "home_score")
    private Integer homeScore;

    @Column(name = "away_score")
    private Integer awayScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

}
