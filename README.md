# 스프링레거시 연습

@Controller, @RequestMapping, @RequestParam, 
@RequestBody, @ResponseBody, @PathVariable, 

##1.@Controller
-해당 어노테이션은 Spring-Context에 Controller 객체를 저장해준다.
-해당 어노테이션이 있는 클래스는 디스패쳐가 찾을 수 있는 객체이다.
-해당 어노테이션이 있는 클래스의 메소드는 ViewResolver 가 관여한다.

##2.@RequestMapping
-해당 어노테이션은 디스패처가 찾아야할 URL을 등록하는 곳이다.
-지원하는 메소드는 GET, POST, PUT, DELETE 이다.

##3.@RequestParam
- 해당 어노테이션은 QueryStirng과  MIME-Type:x-www-form-urlencoded 데이터를 받아준다.
- request.getParameter()함수와 동일한 역할을 한다.

##4. @RequestBody
- 해당 어노테이션은 raw 데이터(형식이 없는 데이터)를 받아올때 사용한다.
- 자바의 BufferedReader와 동일.
- JSP의 request.getReader()와 동일함.

##5. @ResponseBody
-해당 어노테이션은 @Controller 클래스에서 viewResolver가  관여하지 못하게 한다.
-raw데이터를 return 할 때 사용한다.
-자바의  BufferedWriter 혹인 PrintWriter 와 동일함.
-JSP의 out 내장객체와 동일함.


##6. @PathVariable
- 해당 어노테이션은 주소 패스방식을 사용하게 해준다.
-  http://localhost:8080/컨텍스트패스/post/{id}


#7. jackson-mapper 라이브러리  (필터)
-해당 라이브러리는 요청시 json 데이터를 java Object로 변환해서 필터이다. (gson이랑 똑같은 일을 해주지만, 기능은 자기가 알아서 자동으로 해주니까 더 편하다.)
-응답시 java Object를 json 데이터로 변환해주는 필터이다.

#8. git 사용법.
git init

git add  .

git config  --global "ssar@nate.com"
git congif  --glabal "ssar"

git commit -m "스프링 레거시 테스트 완료"

git remote add origin https://github.com/kwonyj729/spring-legacy-test.git

git push origin master




#9. Git 재배포
-git add .
-git commit -m "스프링 레거시 테스트 완료 (2)"
-git push origin master





