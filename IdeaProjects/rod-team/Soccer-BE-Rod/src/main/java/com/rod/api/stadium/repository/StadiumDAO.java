package com.rod.api.stadium.repository;


import com.rod.api.stadium.model.StadiumDTO;

import java.util.List;

public interface StadiumDAO {
    List<StadiumDTO> getAllStadiums();
}
