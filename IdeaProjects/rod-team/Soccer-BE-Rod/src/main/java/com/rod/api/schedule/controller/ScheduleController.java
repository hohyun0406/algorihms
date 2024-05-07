package com.rod.api.schedule.controller;


import com.rod.api.schedule.repository.ScheduleRepository;
import com.rod.api.schedule.service.ScheduleService;
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
@RequestMapping("/api/schedule")
@Log4j2
@RestController
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final ScheduleRepository repository;

    @GetMapping("/problem23")
    private List<Map<String, Object>> problem23(@RequestParam("date1") String date1,
                                                @RequestParam("date2") String date2){
        return scheduleService.problem23(date1, date2);
    }

    @GetMapping("/findAll")
    private List<?> getAllSchedules(){
        return repository.getAllSchedules();
    }
}
