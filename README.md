## *springBasic1st*
  + 1st Example of Spring
  + Ch01. PROJECT 환경설정
    1. 라이브러리 확인(Spring Boot)
    2. view 환경설정 및 hello.html 실행
    3. 배포연습
       1. ./gradlew build
       2.  cd build/libs
       3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
  + Ch02. SPRING 웹 개발 기초
    1. 정적 컨텐츠(hello-static.html)
    2. MVC와 템플릿 엔진(hello-spring)
    3. API(JSON)
  + Ch03. 회원관리 서비스 개발
    1. 회원도메인과 Repository 만들기
    2. 회원 Repository 테스트(@Test, AssertThat) 케이스 작성
    3. 회원 Service 작성
    4. 회원 Service Test 케이스 작성
  + Ch04. 스프링 빈과 의존관계
    1. 컴포넌트 스캔과 자동 의존관계 @Component
    2. 자바코드로 직접 스프링 빈등 @Configuration
  + Ch05. 회원관리 예제
    1. 간단한 회원 웹MVC 구현(memmory 방식)
  + Ch06. 스프링DB
    1. H2 DB 설정
    2. 순수 JDBC(jdbcMemberRepository.java)
    3. 스프링 통합테스트(MemberServiceIntegrationTest)
    4. JPA(JpaMemberRepository) 