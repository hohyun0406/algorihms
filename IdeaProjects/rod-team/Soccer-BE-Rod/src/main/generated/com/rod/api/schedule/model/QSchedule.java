package com.rod.api.schedule.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSchedule is a Querydsl query type for Schedule
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSchedule extends EntityPathBase<Schedule> {

    private static final long serialVersionUID = 1972268075L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSchedule schedule = new QSchedule("schedule");

    public final NumberPath<Integer> awayScore = createNumber("awayScore", Integer.class);

    public final StringPath awayteamId = createString("awayteamId");

    public final StringPath gubun = createString("gubun");

    public final NumberPath<Integer> homeScore = createNumber("homeScore", Integer.class);

    public final StringPath hometeamId = createString("hometeamId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath scheDate = createString("scheDate");

    public final com.rod.api.stadium.model.QStadium stadium;

    public QSchedule(String variable) {
        this(Schedule.class, forVariable(variable), INITS);
    }

    public QSchedule(Path<? extends Schedule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSchedule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSchedule(PathMetadata metadata, PathInits inits) {
        this(Schedule.class, metadata, inits);
    }

    public QSchedule(Class<? extends Schedule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.stadium = inits.isInitialized("stadium") ? new com.rod.api.stadium.model.QStadium(forProperty("stadium")) : null;
    }

}

