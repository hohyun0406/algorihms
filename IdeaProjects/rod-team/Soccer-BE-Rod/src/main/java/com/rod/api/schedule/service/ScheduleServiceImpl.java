package com.rod.api.schedule.service;

import com.rod.api.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl  implements ScheduleService{
    private final ScheduleRepository scheduleRepository;

    @Override
    public List<Map<String, Object>> problem23(String date1, String date2) {
        return scheduleRepository.problem23(date1, date2);
    }

}
