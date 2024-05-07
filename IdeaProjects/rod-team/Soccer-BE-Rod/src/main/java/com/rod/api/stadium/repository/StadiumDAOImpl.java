package com.rod.api.stadium.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.rod.api.stadium.model.QStadium;
import com.rod.api.stadium.model.StadiumDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StadiumDAOImpl implements StadiumDAO{

    private final JPAQueryFactory factory;


    @Override
    public List<StadiumDTO> getAllStadiums() {
        return factory.select(
                QStadium.stadium.id,
                QStadium.stadium.stadiumName,
                QStadium.stadium.homeTeamId,
                QStadium.stadium.seatCount,
                QStadium.stadium.address,
                QStadium.stadium.ddd,
                QStadium.stadium.tel
                ).from(QStadium.stadium)
                .fetch()
                .stream()
                .map(tuple -> StadiumDTO.builder()
                        .id(tuple.get(QStadium.stadium.id))
                        .stadiumName(tuple.get(QStadium.stadium.stadiumName))
                        .homeTeamId(tuple.get(QStadium.stadium.homeTeamId))
                        .seatCount(tuple.get(QStadium.stadium.seatCount))
                        .address(tuple.get(QStadium.stadium.address))
                        .ddd(tuple.get(QStadium.stadium.ddd))
                        .tel(tuple.get(QStadium.stadium.tel))
                        .build()).toList();
    }
}
