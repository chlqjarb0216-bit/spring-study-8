package com.app.controller.study.quiz.quiz19;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.common.CommonCode;
import com.app.dto.user.User;

@Controller
@RequestMapping("/quiz19")
public class Quiz19Controller {

	@GetMapping("/quiz1")
	public String quiz1() {
		return "quiz/quiz19/quiz1";
	}

	@ResponseBody
	@GetMapping("/quiz2")
	public String quiz2() {
		return "return text quiz2";
	}

	// header-JSON
	@ResponseBody
	@GetMapping("/quiz3")
	public User quiz3() {

		User user = new User();
		user.setId("quizid");
		user.setPw("secret");
		user.setName("quiz이름");
		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);

		return user;
	}

	// header-plain text
	//	@ResponseBody
	//	@GetMapping("/quiz3")
	//	public String quiz3() {
	//
	//		User user = new User();
	//		user.setId("quizid");
	//		user.setPw("secret");
	//		user.setName("quiz이름");
	//		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);
	//
	//		ObjectMapper mapper = new ObjectMapper();
	//		String result = null;
	//
	//		try {
	//			result = mapper.writeValueAsString(user);
	//		} catch (JsonProcessingException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//
	//		return result;
	//	}

}
