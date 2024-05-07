package com.rod.api.stadium.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStadium is a Querydsl query type for Stadium
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStadium extends EntityPathBase<Stadium> {

    private static final long serialVersionUID = 697032703L;

    public static final QStadium stadium = new QStadium("stadium");

    public final StringPath address = createString("address");

    public final StringPath ddd = createString("ddd");

    public final StringPath homeTeamId = createString("homeTeamId");

    public final StringPath id = createString("id");

    public final ListPath<com.rod.api.schedule.model.Schedule, com.rod.api.schedule.model.QSchedule> schedules = this.<com.rod.api.schedule.model.Schedule, com.rod.api.schedule.model.QSchedule>createList("schedules", com.rod.api.schedule.model.Schedule.class, com.rod.api.schedule.model.QSchedule.class, PathInits.DIRECT2);

    public final NumberPath<Integer> seatCount = createNumber("seatCount", Integer.class);

    public final StringPath stadiumName = createString("stadiumName");

    public final ListPath<com.rod.api.team.model.Team, com.rod.api.team.model.QTeam> team = this.<com.rod.api.team.model.Team, com.rod.api.team.model.QTeam>createList("team", com.rod.api.team.model.Team.class, com.rod.api.team.model.QTeam.class, PathInits.DIRECT2);

    public final StringPath tel = createString("tel");

    public QStadium(String variable) {
        super(Stadium.class, forVariable(variable));
    }

    public QStadium(Path<? extends Stadium> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStadium(PathMetadata metadata) {
        super(Stadium.class, metadata);
    }

}

