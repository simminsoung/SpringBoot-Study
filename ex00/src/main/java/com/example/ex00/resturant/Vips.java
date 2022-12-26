package com.example.ex00.resturant;


import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
@Qualifier("vips")
public class Vips implements Restaurant {

    public int Steak(){
        return Steak - 10000;
    }
    @Override
    public boolean selfbar(){
        return true;
    }

}
