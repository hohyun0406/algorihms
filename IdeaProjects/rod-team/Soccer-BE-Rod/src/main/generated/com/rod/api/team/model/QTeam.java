package com.rod.api.team.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeam is a Querydsl query type for Team
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTeam extends EntityPathBase<Team> {

    private static final long serialVersionUID = -1298355605L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTeam team = new QTeam("team");

    public final StringPath address = createString("address");

    public final StringPath ddd = createString("ddd");

    public final StringPath eTeamName = createString("eTeamName");

    public final StringPath fax = createString("fax");

    public final StringPath homePage = createString("homePage");

    public final StringPath id = createString("id");

    public final StringPath origYyyy = createString("origYyyy");

    public final StringPath owner = createString("owner");

    public final ListPath<com.rod.api.player.model.Player, com.rod.api.player.model.QPlayer> player = this.<com.rod.api.player.model.Player, com.rod.api.player.model.QPlayer>createList("player", com.rod.api.player.model.Player.class, com.rod.api.player.model.QPlayer.class, PathInits.DIRECT2);

    public final StringPath regionName = createString("regionName");

    public final com.rod.api.stadium.model.QStadium stadium;

    public final StringPath teamName = createString("teamName");

    public final StringPath tel = createString("tel");

    public final StringPath zipCode1 = createString("zipCode1");

    public final StringPath zipCode2 = createString("zipCode2");

    public QTeam(String variable) {
        this(Team.class, forVariable(variable), INITS);
    }

    public QTeam(Path<? extends Team> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTeam(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTeam(PathMetadata metadata, PathInits inits) {
        this(Team.class, metadata, inits);
    }

    public QTeam(Class<? extends Team> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.stadium = inits.isInitialized("stadium") ? new com.rod.api.stadium.model.QStadium(forProperty("stadium")) : null;
    }

}

