package com.example.ex02.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StoreVO {
    private String name;
    private int price;
    private int stock;
    private String brand;



}
