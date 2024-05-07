package com.rod.api.schedule.repository;

import com.rod.api.schedule.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>, ScheduleDAO {
    @Query("select distinct new map((select s.stadiumName from Stadium s where s.id = sc.stadium.id) as stadium) " +
            "from schedule sc " +
            "where sc.scheDate between :startDate and :endDate")
    List<Map<String, Object>> problem23(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
