package com.rod.api.stadium.service;

import com.rod.api.stadium.repository.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService{
    private final StadiumRepository stadiumRepository;

    @Override
    public List<Map<String, Object>> problem14(String date) {
        return stadiumRepository.problem14(date);
    }

    @Override
    public List<Map<String, Object>> problem15(String date, String team, String position) {
        return stadiumRepository.problem15(date, team, position);
    }

    @Override
    public List<Map<String, Object>> problem16(String score) {
        return stadiumRepository.problem16(score);
    }

    @Override
    public List<Map<String, Object>> problem17() {
        return stadiumRepository.problem17();
    }

}
