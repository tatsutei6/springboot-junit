package org.tei.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {
    private static final long serialVersionUID = 67832438L;
    private String name;
    private Double price;
}
