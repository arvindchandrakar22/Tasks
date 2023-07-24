package com.taskone.crudoperation.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer prodId;
    private String prodCode;
    private Double prodCost;

    private Double prodDiscount;
    private Double prodGst;
}