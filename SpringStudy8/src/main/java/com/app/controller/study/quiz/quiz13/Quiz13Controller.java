package com.app.controller.study.quiz.quiz13;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.util.MyCookieUtil;

@Controller
@RequestMapping("/quiz13")
public class Quiz13Controller {

	String antiAdKey = "antiAd";

	@GetMapping("/hideAd")
	public String hideAd(HttpServletRequest request) {
		if (MyCookieUtil.getCookieValue(request, antiAdKey) != null)
			request.setAttribute(antiAdKey, true);

		return "quiz/quiz13/hideAd";
	}

	@PostMapping("/hideAd")
	public String hideAd(HttpServletRequest request, HttpServletResponse response) {
		if (request.getParameter(antiAdKey) != null)
			response.addCookie(MyCookieUtil.createCookie(antiAdKey, "true", 60 * 60 * 24));

		return "redirect:/quiz13/hideAd";
	}

	@GetMapping("/reAd")
	public String reAd(HttpServletResponse response) {
		response.addCookie(MyCookieUtil.createCookieForRemove(antiAdKey));

		return "redirect:/quiz13/hideAd";
	}

}
