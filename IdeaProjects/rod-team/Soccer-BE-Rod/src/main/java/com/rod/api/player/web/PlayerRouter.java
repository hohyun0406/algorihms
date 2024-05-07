package com.rod.api.player.web;

import com.rod.api.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PlayerRouter {
    private final PlayerRepository repository;


    public List<?> execute(String q, String playerName, String position,
                                             String teamId, String regionName, String height,
                                             String teamName1, String teamName2, String min, String max){

     return switch (q){
                    case "2" -> repository.getPractice2();
                    case "4" -> repository.getPractice4(teamId,position);
                    case "5" -> repository.getPractice5(teamId,playerName,height);
                    case "5-1" -> repository.getFiveOne(playerName,height,regionName);
                    case "6" -> repository.getPractice6(teamName1,teamName2,position,min,max);
                    case "7" -> repository.getPractice7(position,regionName);
                    case "8" -> repository.getPractice8(regionName);
                    case "9" -> repository.getPractice9(regionName);
                    case "18" -> repository.getPractice18();
                    case "20" -> repository.getPractice20(position);
                    case "21" -> repository.getPractice21();
                    case "22" -> repository.getPractice22();
                    case "all" -> repository.getAllPlayers();
                    default -> null;
     };
    }
}
