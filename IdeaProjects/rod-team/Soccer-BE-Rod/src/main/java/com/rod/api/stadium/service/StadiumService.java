package com.rod.api.stadium.service;

import java.util.List;
import java.util.Map;

public interface StadiumService {
    List<Map<String, Object>> problem14(String date);

    List<Map<String, Object>> problem15(String date, String team, String position);

    List<Map<String, Object>> problem16(String score);

    List<Map<String, Object>> problem17();
}
