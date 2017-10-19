package com.mydemos.springbootdemo.springbootdemo.domain;

import lombok.*;

@Data
@Builder
public class User {
    private Long id;
    private String name;
    private String des;
}
