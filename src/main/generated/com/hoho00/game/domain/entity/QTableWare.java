package com.hoho00.game.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTableWare is a Querydsl query type for TableWare
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTableWare extends EntityPathBase<TableWare> {

    private static final long serialVersionUID = 1025816097L;

    public static final QTableWare tableWare = new QTableWare("tableWare");

    public final StringPath img = createString("img");

    public final NumberPath<Long> tableWareId = createNumber("tableWareId", Long.class);

    public QTableWare(String variable) {
        super(TableWare.class, forVariable(variable));
    }

    public QTableWare(Path<? extends TableWare> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTableWare(PathMetadata metadata) {
        super(TableWare.class, metadata);
    }

}

