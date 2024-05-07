package com.rod.api.player.service;

import com.rod.api.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository repository;


    @Override
    public List<Map<String, Object>> getPractice2() {
        log.info("Position : {}", repository.getPractice2());
        return repository.getPractice2();
    }

    @Override
    public List<Map<String, Object>> getPractice4(String teamId, String position) {
        return repository.getPractice4(teamId, position);
    }

    @Override
    public List<Map<String, Object>> getFiveOne(String playerName, String height, String regionName) {
        return repository.getFiveOne(playerName, height, regionName);
    }

//    @Override
//    public List<Player> getPlayerByTeamIdAndNameAndHeight() {
//        return repository.getPlayerByTeamIdAndNameAndHeight();
//    }
//    @Override
//    public List<Player> findFirst5OrderById() {
//       return repository.findFirst5OrderById();
//    }

    @Override
    public List<Map<String, Object>> getPractice5(String teamId, String playerName, String height) {
        return repository.getPractice5(teamId, playerName, height);
    }

    @Override
    public List<Map<String, Object>> getPractice18() {
        return repository.getPractice18().stream().limit(5).toList();
    }

    @Override
    public List<Map<String, Object>> getPractice6(String team1, String team2,String position, String min, String max) {
        return repository.getPractice6(team1, team2, position, min, max);
    }
    @Override
    public List<Map<String, Object>> getPractice7(String position, String regionName) {
        return repository.getPractice7(position,regionName);
    }


    @Override
    public List<Map<String, Object>> getPractice8(String regionName) {
        return repository.getPractice8(regionName);
    }

    @Override
    public List<Map<String, Object>> getPractice9(String regionName) {
        return repository.getPractice9(regionName);
    }

    @Override
    public List<Map<String, Object>> getPractice20(String position) {
        return repository.getPractice20(position);
    }

    @Override
    public List<Map<String, Object>> getPractice21() {
        return repository.getPractice21();
    }


}
