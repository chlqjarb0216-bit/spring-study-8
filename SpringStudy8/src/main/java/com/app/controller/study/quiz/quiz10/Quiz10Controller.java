package com.app.controller.study.quiz.quiz10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz10")
public class Quiz10Controller {

	@GetMapping("/A")
	public String a(HttpServletRequest request) {

		request.setAttribute("from", "A");

		return "quiz/quiz10/ab";
	}

	@GetMapping("/B")
	public String b(HttpServletRequest request) {

		request.setAttribute("from", "B");

		HttpSession session = request.getSession();
		session.setAttribute("session", "FromB");

		return "quiz/quiz10/ab";
	}

}
