package com.rod.api.team.model;

import com.querydsl.core.annotations.QueryProjection;
import jakarta.xml.ws.BindingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TeamDTO {
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
    private String stadiumId;

    @QueryProjection

    public TeamDTO(String id, String regionName, String teamName, String eTeamName, String origYyyy, String zipCode1, String zipCode2, String address, String ddd, String tel, String fax, String homePage, String owner, String stadiumId) {
        this.id = id;
        this.regionName = regionName;
        this.teamName = teamName;
        this.eTeamName = eTeamName;
        this.origYyyy = origYyyy;
        this.zipCode1 = zipCode1;
        this.zipCode2 = zipCode2;
        this.address = address;
        this.ddd = ddd;
        this.tel = tel;
        this.fax = fax;
        this.homePage = homePage;
        this.owner = owner;
        this.stadiumId = stadiumId;
    }
}
