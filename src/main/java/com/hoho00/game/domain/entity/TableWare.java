package com.hoho00.game.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_member")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TableWare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_ware_id", unique = true, nullable = false)
    private Long tableWareId;

    @Column(columnDefinition = "VARCHAR(255)")
    private String img;
}
