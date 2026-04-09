package com.tenco.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Sales {

    private int productId;
    private int quantity;
    private double unitPrice;
    private LocalDate soldAt;

}
