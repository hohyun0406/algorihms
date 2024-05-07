package com.rod.api.schedule.repository;


import com.rod.api.schedule.model.ScheduleDTO;

import java.util.List;

public interface ScheduleDAO {

    List<ScheduleDTO> getAllSchedules();
}
