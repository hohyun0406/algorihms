package com.rod.api.stadium.model;

import com.rod.api.schedule.model.Schedule;
import com.rod.api.team.model.Team;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString
@Entity
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String stadiumName;
    private String homeTeamId;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;

    @OneToMany(mappedBy = "stadium")
    private List<Schedule> schedules;

    @OneToMany(mappedBy = "stadium")
    private List<Team> team;
}
