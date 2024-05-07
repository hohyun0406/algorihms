package com.rod.api.stadium.controller;

import com.rod.api.stadium.repository.StadiumRepository;
import com.rod.api.stadium.service.StadiumService;
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
@RequestMapping("/api/stadium")
@Log4j2
@RestController
public class StadiumController {
    private final StadiumService stadiumService;
    private final StadiumRepository repository;

    @GetMapping("/problem14")
    private List<Map<String, Object>> problem14(@RequestParam("date") String date) {
        return stadiumService.problem14(date);
    }

    @GetMapping("/problem15")
    private List<Map<String, Object>> problem15(@RequestParam("date") String date,
                                                @RequestParam("team") String team,
                                                @RequestParam("position") String position) {
        return stadiumService.problem15(date, team, position);
    }

    @GetMapping("/problem16")
    private List<Map<String, Object>> problem16(@RequestParam("score") String score) {
        return stadiumService.problem16(score);
    }

    @GetMapping("/problem17")
    private List<Map<String, Object>> problem17() {
        return stadiumService.problem17();
    }

    @GetMapping("/findAll")
    private List<?> getAllStadiums() {
        return repository.getAllStadiums();
    }


}
