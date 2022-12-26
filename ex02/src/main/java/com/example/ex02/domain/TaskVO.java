package com.example.ex02.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TaskVO {
    private int num;        // 학생 번호
    private int kor;        // 국어점수
    private int eng;        // 영어 점수
    private int math;       // 수학 점수


//    총합 받아올 메소드
    public int getTotal(){
        return kor + eng + math;    // 국어 +  영어 +수학
    }
//    평균 받아올 메소드
    public double getAverage(){
        return getTotal() / 3.0;        // 총합에 나누기 3.0
    }
}