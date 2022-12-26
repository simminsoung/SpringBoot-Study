package com.example.ex00.resturant;


import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
@Qualifier("outback") @Primary
public class Outback implements Restaurant {
//test
    private int  Steak() {
        return Steak - 4000;
    }

    @Override
    public boolean selfbar(){
        return false;
    }


}

