package com.rod.api.team.service;

import com.rod.api.team.model.TeamDTO;
import com.rod.api.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository teamRepository;

//    @Override
//    public List<Map<String, Object>> problem1() {
//        return teamRepository.problem1();
//    }
//
//    @Override
//    public List<Map<String, Object>> problem10(@RequestParam("team1") String team1,
//                                               @RequestParam("team2") String team2,
//                                               @RequestParam("team3") String position) {
//        return teamRepository.problem10(team1, team2, position);
//    }
//
//    @Override
//    public List<Map<String, Object>> problem11() {
//        return teamRepository.problem11();
//    }
//
//    @Override
//    public List<Map<String, Object>> problem12(@RequestParam("team1") String team1,
//                                               @RequestParam("team2") String team2,
//                                               @RequestParam("height1") double height1,
//                                               @RequestParam("height2") double height2) {
//        return teamRepository.problem12(team1, team2, height1, height2);
//    }
//
//    @Override
//    public List<Map<String, Object>> problem13() {
//        return teamRepository.problem13();
//    }
//
//    @Override
//    public List<Map<String, Object>> problem19(@RequestParam("height") double height) {
//        return teamRepository.problem19(height);
//    }
//
//    @Override
//    public List<TeamDTO> getAllTeams() {
//        return teamRepository.getAllTeams();
//    }
}
