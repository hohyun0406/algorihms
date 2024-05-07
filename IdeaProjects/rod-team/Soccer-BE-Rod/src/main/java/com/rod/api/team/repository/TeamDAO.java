package com.rod.api.team.repository;

import com.rod.api.team.model.TeamDTO;

import java.util.List;

public interface TeamDAO {
    List<TeamDTO> getAllTeams();
}
