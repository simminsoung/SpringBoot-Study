package com.example.ex02.controller;

import com.example.ex02.domain.StoreVO;
import com.example.ex02.domain.TaskVO;
import com.example.ex02.domain.UserVO;
import com.example.ex02.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequestMapping("/ex/*")
public class ExampleController {



    @RequestMapping(value = "ex01", method = {RequestMethod.GET, RequestMethod.POST})
    public void ex01(){
        log.info("ex01...........");
    }

    // jsp에서는 getParameter로 쿼리스트링으로 값을 받아올수 있었다 이렇게 쓰지말고
    @GetMapping("ex02")
    public void ex02(HttpServletRequest request){
        log.info("name: " + request.getParameter("name"));
    }

    // 하지만 스프링에선 더 편하게 줄여서 쓸쑤있음 바로 매개변수로 받아도 가능함
    @GetMapping("ex03")
    public void ex03(String name){
        log.info("name: " + name);
    }

    // 모델 안에 선언해 놓은 필드명으로 매핑도 가능함 , 퀴리 스트링도 똑같이 적어주면됨
    @GetMapping("ex04")
    public void ex04(MemberVO memberVO){
        log.info("member: " + memberVO);
    }

    // 필드명을 다르게 해서 하는 방법도 있는데 잘 안쓰긴함 어노테이션@RequestParam을써서 id에있는 key 값을 name에 적어준다 저 name(id 값이 들어간)을 가지고 메소드 실행됨
    @GetMapping("ex05")
    public void ex05(@RequestParam("id") String name, int age){
        log.info("name: " + name);
        log.info("age " + age);
    }

    // 화면에서 출력하는 예시
    @GetMapping("/ex06")
    public void ex06(MemberVO memberVO){
        log.info("ex06..............");
    }


    @GetMapping("ex07")
                      // 따로 젠더만드는 경우 @ModelAttribute 모델에다 속성 넣는거 ("키값") , 벨류값
    public void ex07(@ModelAttribute("gender") String gender, MemberVO memberVO){
        log.info("ex07..............");
        log.info("memberVO: " + memberVO);
        log.info("gender: " + gender);
    }

//=======================================================================================================
//    외부에서 상품명, 상품가격 , 상품재고 , 브랜드 전달받아서 화면에 전송

//    화면에서 4개 정보 입력 후 form태그로 전송한다.

    @GetMapping("shop")
    public void shop(StoreVO storeVO){
        log.info("shop@!#$");

    }

    @GetMapping("store")
    public void store(StoreVO storeVO){
        log.info("store!@#!@#!@#!@#!@$!@$!@#");
        log.info("storeVO: " + storeVO);

    }
//================================================================================================

//    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math 선언
//    총점과 평균 점수 화면에 출력

//    Get 방식
    @GetMapping("/exam")
    public String exam(){return "ex/exam";}
//  Post 방식
    @PostMapping("/exam")
    public String exam(TaskVO taskVO){return "ex/result";}



//===============================================================================================

//    아이디와 비밀번호를 입력받은 후 아이디가 admin일 경우 admin.html로 이동
//    아이디가 user일 경우 user.html로 이동
//
//    - login.html : 아이디와 비밀번호 입력 페이지 출력
//    - admin.html : 관리자 페이지 출력
//    - user.html : 일반 회원 페이지 출력

    @GetMapping("/login")
    public void login(String id ,  String pw){
        log.info("admin@#!@#!@#!@#!@$!@$!@#");
    }

//    @PostMapping("/user")
//    public user(){

//    }


//==============================================================================================




}



















