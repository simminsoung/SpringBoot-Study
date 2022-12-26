# SpringBoot-Study
- Spring Boot 10월 31일 ~ 11월 11일 

# STUDY
- 프레임워크 
	 - 뼈대나 근간을 이루는 코드들의 묶음.
   
- 라이브러리
  	- 개발자가 작성해놓은 코드파일를 의미하며 
	API란 , 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.
	프레임 워크란,  API가 굉장히 많이 모여져서 덩치가 커져있는 것을 의미한다.
	개발자는 각 개개인의 능력차이가 큰 직종이고, 개발자 구성에 따라 프로젝트 결과 역시
	큰 차이를 낳는다. 이런 상황을 극복하기 위한  코드의 결과물이 바로 프레임 워크다.
	프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식으로
	개발하게 된다.

- 프레임워크의 장점
    	
	- 개발에 필요한 구조를 이미 코드로 만들어 놓았기 떄문에, 실력이 부족한 개발자라 하더라도
	 반쯤 완성한 상태에서 필요한 부부늘 조립하는 형태의 개발이 가능하다.
	 회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고,
         개발자 입장에서는 완성된 구조에 자신이 맡은 서비르에 대한 코드를 개발해서 넣기 떄문에 
         개발 시간을 단축 할수 있다.

- 스프링 부트
	- 스프링 프레임워크를 사용한에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며,
	시간이 너무 많이 걸리기 때문에 자동 설정(AutoConfiguration)과 개발에 필요한 모든 것을 관리해주는
	스프링 부트를 선호 한다. 각 코어 및 라이브러리의 버전들도 맞추어야 하지만 스프링 부트를 사용하면
	이러한 복잡성을 해결하기에도 좋다.
  
- POJO(Plain Old Java Object) 기반의 구성 
  - 오래된 방식의 간단한 자바 객체라는 의미이며 , java 코드에서 일반적으로
	객체를 구성하는 방식을 스프링 프레임워크에서 그대로 사용할 수 있다는 말이다.
	
-  의존성 주입 (DI)를 통한 객체간의 관계 구성 
	- EX: 요리가 칼한테... 칼없으면 요리 못 , NEW를 해야 의존성 투입가능
	- 의존성(Dependency) 
	하나의 객체가 다르 객체없이 제대로 된 역활을 할 수 없다는 것을 의미한다.
	*예를 들어 A객체가 B 객체없이 동작이 불가능한 상황을 'A가 B에 의존적이다' 라고 표현한다.*

	- 주입 (Injection) 
	말 그대로 외부에서 밀어 넣는 것을 의미한다.
	예를 들어 어떤 객체가 필요로하는 객체를 외부에서 밀어 넣는 것을 의미한다.
	주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역활을 변하지 않는다.
	
	**의존성
	ⓐ →→→→→→→→→ ⓑ
	ⓐ객체에서 ⓑ객체를 직접 생성

	**의존성 주입
	ⓐ →→→→→???↔↔↔↔↔↔↔ ⓑ
	ⓐ는 ⓑ가 필요하다는 신호를 보내고 , ???가 ⓑ객체를 외부에서 생성하여 주입하게 된다.
	
	의존성 주입 방식을 사용하기 위해서는 ???라는 존재가 필요하게 된다.
	스프링 프레임워크에서는 ApplicationContext가 ??? 라는 존재이며,
	필요한 객체들을 생성하고, 필요한 객체들을 주입해주는 역활을 한다.
	따라서 개발자들은 기조의 프로그래밍과 달리 객체와 객체를 분리해서 생성하고,
	이러한 객체들을 엮는(wiring) 작업의 형태로 개발하게 된다.

	ApplicationContext가 관리하는 객체들은 빈(Bean)이라 부르고 , 빈과 빈 사이의 의존 관계를 처리하는
	방식으로는 XML, 어노테이션, JAVA 방식이 있다.
	
- Spring MVC 패턴의 특징
   - HttpServletRequest, HttpServletResponse를 거의 사용할 필요 없이 기능 구현
   - 다양한 타입의 파라미터 처리, 다양한 타입의 리턴 타입 사용 가능
   - GET 방식, POST 방식 등 전송 방식에 대한 처리를 어노테이션으로 처리 가능
   - 상속/인터페이스 방식 대신 어노테이션으로만 설정 가능
   
   - 3-tier
	스프링 프로젝트는 3-tier 방식으로 구성한다.
	- [Presentation Tier - 화면 계층]
	화면에 보여주는 기술을 사용하는 영역.
	컨트롤러에서 사용자의 요청에 맞는 응답처리를 진행하며,
	HTML엔진(Thymeleaf), HTML등이 담당하는 영역이다.
	화면 구성이 이에 속한다.
	- [Business Tier - 비지니스 계층]
	순수한 비지니스 로직을 담고 있는 영역.
	고객이 원하는 요구사항을 반영하는 계층이기 때문에 서비스에 있어서 가장 중요한 영역이다.
	이 영역의 설계는 고객의 요구 사항과 정확히 일치해야 하며, 서비스 영역이다.
	- [Persistence Tier - 영속 계층 혹은 데이터 계층]
	데이터를 어떤 방식으로 보관하고, 사용하는 가에 대한 설계가 들어가는 계층.
	일반적으로 DBMS를 많이 이용하지만, 상황에 따라서 네트워크 호출 혹은 원격 호출 등의 기술이 접목될 수 있다.
	- 각 영역은 독립적으로 설계되어 나중에 특정한 기술이 변하더라도 필요한 부분을 전자제품의 부품처럼
쉽게 교환할 수 있게 하자는 방식이다. 각 연결 부위는 인터페이스를 이용해서 설계하는 것이 일반적인 구성 방식이다.
----------------------------------------------------------------------------------------------------------------------------------
					Presentation ↔ Business ↔ Persistence ↔ DBMS
	 					    ↑		↑	      ↑
						Controller   Service	    Mapper
----------------------------------------------------------------------------------------------------------------------------------
- 비지니스 계층
프레젠테이션 계층과 영속 계층의 중간 다리 역할을 한다.
영속 계층은 DBMS를 기준으로, 비지니스 계층은 로직을 기준으로 처리한다.
예를 들어 쇼핑몰에서 상품 구매시 포인트 적립을 한다고 가정한다면,
영속 계층의 설계는 '상품', '회원'으로 나누어 설계하지만 비지니스 계층은
상품 영역과 회원 영역을 동시에 사용해서 하나의 로직을 처리하게 된다.
이 때 하나의 서비스에 필요한 여러 개의 쿼리 메소드를 하나로 묶어주는 역할이 필요한데, 
이를 Service 객체로 사용한다.
	
  
  - AOP(Aspect Oriented Programming)
	- 관점이란 개발에 있어서, 관심사(Concern)를 의미한다.
	코드의 중복을 줄일 수 있으며, 핵심 로직과 주변 로직을 분리하여 관리할 수 있다.
		- 파라미터가 잘 전달 되었는가?
		- 이 로직에서 발생할 수 있는 모든 예외 처리

	- 핵심 로직은 아니지만 반복적으로 개발에 필요한 관심사들을 주변 로직이라고 한다.
	따라서 AOP는 이러한 주변 로직을 횡단 고나심사로 분리하여 작성하고
	종단 괸심사인 핵심 비지니스 로직만을 작성하도록 한다.

		- 예)	나눗셈 프로그램 개발 시 두 개의 숫자를 나누는 것 (핵심, 종단)
		0으로 나누는 지 검사하는 것 (주변, 횡단)
	- 즉, 반복적으로 나타나는 횡단 관심사를 모듈로 분리한 후 적절한 시점에
	로직을 주입하는 것이 AOP이다. 스프링에서는 별도의 복잡한 설정 없이 간편하게
	AOP의 기능들을 구현할 수 있기 때문에 중요한 특징 중 하나이다.

- AOP를 사용할 수 있는 시점
	- Around (전 구역)
	- Before(메소드 시작 직후)
	- After(메소드 종료 직전)
	- AfterReturning(메소드 리턴 후)
	- AfterThrowing(메소드 예외 발생 후)

- AOP 설계 순서
	- 구현할 횡단 관심사를 의미할 수 있는 어노테이션 만들기
	- 어노테이션을  AOP로 등록하기
	- 종단 관심사에 등록된 어노테이션 사용하기
  
  # 느낀점
  	 JSP를 하고 Spring Boot를 배웠다 뭔가 더욱더 고맙다는걸 느낄수있었다
	 물론 더 많은걸 공부해야하지만 더 열심히 해봐야겠다라는 생각을 했다. 
	
