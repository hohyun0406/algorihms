package com.rod.api.team.model;

import com.rod.api.player.model.Player;
import com.rod.api.stadium.model.Stadium;
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
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homePage;
    private String owner;

    @OneToMany(mappedBy = "team")
    private List<Player> player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;
}
