package com.example.ex00.dependecy;

import com.example.ex00.resturant.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ResturantTest {

    @Autowired
    private Restaurant outback;

    @Autowired @Qualifier("vips")
    private Restaurant vips;


    @Test
    public void resturantTest(){

        log.info(outback + "");
        log.info(vips + "");

    }

}
