package com.tenco.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Admin {

    private String admin_id;
    private String password;
    private String name;


}
