package com.example.ex01.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class MapperTest {

    @Autowired
    private TimeMapper timeMapper;


    @Test
    public void setTimeMapper(){
        log.info("timeMapper : " + timeMapper);         // Mapper  Proxy(가짜 객체) :필요한 부분에 가지고 있는것. 원본을 대신하는친구
        log.info("getTime : " + timeMapper.getTime());
        log.info("getTimeQuick : " + timeMapper.getTimeQuick());
    }
}
