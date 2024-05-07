package com.rod.api.player.repository;


import com.rod.api.player.model.PlayerDTO;

import java.util.List;

public interface PlayerDAO {
   List<PlayerDTO> getAllPlayers();
}
