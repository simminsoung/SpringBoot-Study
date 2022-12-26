package com.example.ex01.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper //메퍼와 연동
public interface TimeMapper {   // 인터페이스 이름도 xml과 똑같이 써줌

    public String getTime();    // 메퍼에설정한 메소드 이름  id 똑같이

    @Select("SELECT SYSDATE FROM DUAL")         // 요케 쓸수 있다다 , 퀴리가 짧을때만 쓰자
   public String getTimeQuick();

}
