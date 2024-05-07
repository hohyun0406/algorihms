package com.rod.api.player.repository;

import com.rod.api.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerJpqlRepository, PlayerDAO{


}
