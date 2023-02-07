package com.ohmin839.jybuben.orm;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Column(nullable = false)
    @Version
    private Integer version = 0;

    @Column(nullable = false)
    private Boolean delFlg = false;

    @Column(nullable = false)
    private Timestamp crtTimestamp;

    @Column(nullable = false)
    private Timestamp updTimestamp;
}