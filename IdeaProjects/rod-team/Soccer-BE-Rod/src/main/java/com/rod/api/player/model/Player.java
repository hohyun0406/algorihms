package com.rod.api.player.model;

import com.rod.api.team.model.Team;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String playerName;

    private String ePlayerName;

    private String nickname;

    private String joinYyyy;

    private String position;

    private String backNo;

    private String nation;

    private String birthDate;

    private String solar;

    private String height;

    private String weight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

}
