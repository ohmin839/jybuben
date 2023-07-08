package com.ohmin839.jybuben.rsom;

import java.io.Serializable;

import lombok.Data;

@Data
public class TRawWord implements Serializable {
    private Integer id;
    private String val;
}