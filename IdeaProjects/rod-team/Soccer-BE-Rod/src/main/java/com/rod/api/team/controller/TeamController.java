package com.rod.api.team.controller;

import com.rod.api.team.model.TeamDTO;
import com.rod.api.team.service.TeamService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Customer not found")})
@RequestMapping("/api/team")
@Log4j2
@RestController
public class TeamController {
    private final TeamService teamService;

//    @GetMapping("/problem1")
//    private List<Map<String, Object>> problem1() {
//        return teamService.problem1();
//    }
//
//    @GetMapping("/problem10")
//    private List<Map<String, Object>> problem2(@RequestParam("team1") String team1,
//                                               @RequestParam("team2") String team2,
//                                               @RequestParam("position") String position) {
//        return teamService.problem10(team1, team2, position);
//    }
//
//    @GetMapping("/problem11")
//    private List<Map<String, Object>> problem11() {
//        return teamService.problem11();
//    }
//
//    @GetMapping("/problem12")
//    private List<Map<String, Object>> problem12(@RequestParam("team1") String team1,
//                                                @RequestParam("team2") String team2,
//                                                @RequestParam("height1") double height1,
//                                                @RequestParam("height2") double height2) {
//        return teamService.problem12(team1, team2, height1, height2);
//    }
//
//    @GetMapping("/problem13")
//    private List<Map<String, Object>> problem13() {
//        return teamService.problem13();
//    }
//
//    @GetMapping("/problem19")
//    private List<Map<String, Object>> problem19(@RequestParam("height") double height) {
//        return teamService.problem19(height);
//    }
//
//    @GetMapping("/getAllTeam")
//    private List<TeamDTO> getAllTeam() {
//        return teamService.getAllTeams();
//    }
}
