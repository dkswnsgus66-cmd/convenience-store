package com.tenco.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private String barcode;
    private String name;
    private String category;
    private double price;
    private double cost;
    private int stock;
    private int minStock;
    private LocalDate expireDate;
    private Boolean isActive;

}
