package com.rod.api.player.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.rod.api.player.model.PlayerDTO;
import com.rod.api.player.model.QPlayer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PlayerDAOImpl implements PlayerDAO {

    private final JPAQueryFactory factory;
    @Override
    public List<PlayerDTO> getAllPlayers() {
        return factory.select(
                QPlayer.player.id,
                QPlayer.player.playerName,
                QPlayer.player.ePlayerName,
                QPlayer.player.nickname,
                QPlayer.player.joinYyyy,
                QPlayer.player.position,
                QPlayer.player.backNo,
                QPlayer.player.nation,
                QPlayer.player.birthDate,
                QPlayer.player.solar,
                QPlayer.player.height,
                QPlayer.player.weight,
                QPlayer.player.team.id
        ).from(QPlayer.player)
                .fetch()
                .stream().map(tuple -> PlayerDTO.builder()
                        .id(tuple.get(QPlayer.player.id))
                        .playerName(tuple.get(QPlayer.player.playerName))
                        .ePlayerName(tuple.get(QPlayer.player.ePlayerName))
                        .nickname(tuple.get(QPlayer.player.nickname))
                        .joinYyyy(tuple.get(QPlayer.player.joinYyyy))
                        .position(tuple.get(QPlayer.player.position))
                        .backNo(tuple.get(QPlayer.player.backNo))
                        .nation(tuple.get(QPlayer.player.nation))
                        .birthDate(tuple.get(QPlayer.player.birthDate))
                        .solar(tuple.get(QPlayer.player.solar))
                        .height(tuple.get(QPlayer.player.height))
                        .weight(tuple.get(QPlayer.player.weight))
                        .teamId(tuple.get(QPlayer.player.team.id))
                        .build()
                ).toList();
    }

}
