package com.cos.springlegacy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.springlegacy.dto.RequestInfoDto;


// http://localhost:8080/springlegacy/
// Controller 어노테이션은 페이지를 리턴하는 어노테이션이다.
// restController 어노테이션은 데이터를 리턴하는 어노테이션이다.

@Controller
public class HomeController {
	
	/* 1. 데이터 전달 - 쿼리스트링, Form데이터, Json 
	 * 2. 데이터 받기 - 쿼리스트링, Form데이터, Json 
	 * 3. Pathvariable  사용해보기.
	 */	
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home (Model model) {
		// Controller 어노테이션이 있는 클래스에서 함수가 리턴하는 순간.
		// ViewResolver가 관여해서, prefix와 suffix를 만들어서
		// 페이지를 리턴한다.
		
//		System.out.println("안녕");
				
		String username="ssar";
		model.addAttribute("username", username);
		
		return "home";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)   // cmd 방식이 아니라, 정규 표현식으로 주소를 쓴다.!!
	//네이밍 규칙 : 함수이름은 주소이름이랑 똑같이 해주면 된다.
	public String hello(@RequestParam("id") String id, 
						@RequestParam("pw") String pw,
						Model model) {   //QueryStirng, x-www-formurlencoded  ()
		
		System.out.println("id : "+id);
		System.out.println("pw : " +pw);
		
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
	
		return "hello";
	}
	
	@RequestMapping(value = "/goodbye", method = RequestMethod.GET)   
	public String goodbye(RequestInfoDto requestInfoDto) {
		
		System.out.println("addr : " +requestInfoDto.getAddr());
		System.out.println("hobby : " +requestInfoDto.getHobby());
	
		return "goodbye";
	}
	
}
