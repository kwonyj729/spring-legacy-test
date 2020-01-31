package com.cos.springlegacy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springlegacy.dto.RequestJsonDto;

//import com.cos.springlegacy.dto.RequestJsonDto;

@Controller
public class JsonController {
	
	// 스프링은 form의 name 값 혹은 쿼리 스트링만 오브젝트로 자동 변환.!!   
	// 위에 무슨말인겨?? (Postman에서 테스트함.)
	@RequestMapping(value="/jsonHome", method=RequestMethod.POST)
//	public String jsonHome(Map<String, Object> data) {
	//Json 받을때는 DTO (오브젝트) 만들어서 받는게 제일 좋다.
	public @ResponseBody RequestJsonDto jsonTest(@RequestBody RequestJsonDto requestJsonDto) {

//	public String jsonHome(@RequestBody String data) {	 // 실제로는 {제이슨}
//		System.out.println(dto);
//		System.out.println("id : " +data.get("id"));

//		System.out.println(data);
		System.out.println("id : " + requestJsonDto.getId());
		
		return requestJsonDto;
	}
	
	
	//페이징 할때 많이 쓴다.
	// http://localhost:8080/springlegacy/jsonHome/1
	@RequestMapping(value="/jsonHome/{num}", method=RequestMethod.GET)
	public String jsonHome(@PathVariable("num") int num) {   // @PathVariable("")를 생략하면 스프링이 requestParam 이랑 헷갈리기 때문에, 생략하면 안된다.
		
		System.out.println("num : " +num);
		
		return "jsonHome";
	}

}
