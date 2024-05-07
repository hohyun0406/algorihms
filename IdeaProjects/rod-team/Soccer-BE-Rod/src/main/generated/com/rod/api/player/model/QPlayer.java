package com.rod.api.player.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlayer is a Querydsl query type for Player
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayer extends EntityPathBase<Player> {

    private static final long serialVersionUID = -606949525L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlayer player = new QPlayer("player");

    public final StringPath backNo = createString("backNo");

    public final StringPath birthDate = createString("birthDate");

    public final StringPath ePlayerName = createString("ePlayerName");

    public final StringPath height = createString("height");

    public final StringPath id = createString("id");

    public final StringPath joinYyyy = createString("joinYyyy");

    public final StringPath nation = createString("nation");

    public final StringPath nickname = createString("nickname");

    public final StringPath playerName = createString("playerName");

    public final StringPath position = createString("position");

    public final StringPath solar = createString("solar");

    public final com.rod.api.team.model.QTeam team;

    public final StringPath weight = createString("weight");

    public QPlayer(String variable) {
        this(Player.class, forVariable(variable), INITS);
    }

    public QPlayer(Path<? extends Player> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlayer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlayer(PathMetadata metadata, PathInits inits) {
        this(Player.class, metadata, inits);
    }

    public QPlayer(Class<? extends Player> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.team = inits.isInitialized("team") ? new com.rod.api.team.model.QTeam(forProperty("team"), inits.get("team")) : null;
    }

}

