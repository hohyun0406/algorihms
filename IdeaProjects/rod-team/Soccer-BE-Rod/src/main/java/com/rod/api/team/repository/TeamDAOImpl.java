package com.rod.api.team.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.rod.api.team.model.QTeam;
import com.rod.api.team.model.QTeamDTO;
import com.rod.api.team.model.TeamDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamDAOImpl implements TeamDAO{
    private final JPAQueryFactory queryFactory;
    private final QTeam team = QTeam.team;


    public List<TeamDTO> getAllTeams() {
        return queryFactory
                .select(new QTeamDTO(
                        team.id,
                        team.regionName,
                        team.teamName,
                        team.eTeamName,
                        team.origYyyy,
                        team.zipCode1,
                        team.zipCode2,
                        team.address,
                        team.ddd,
                        team.tel,
                        team.fax,
                        team.homePage,
                        team.owner,
                        team.stadium.id
                        ))
                .from(team)
                .fetch();
    }

}
