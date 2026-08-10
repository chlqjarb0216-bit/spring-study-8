package com.app.controller.study.quiz.quiz12;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz12")
public class Quiz12Controller {

	@GetMapping("/login")
	public String login() {

		return "quiz/quiz12/login";
	}

	/*//count를 쿠키에 저장
	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	
		String id = request.getParameter("id");
		if (MyCookieUtil.getCookieValue(request, id) == null) {
			response.addCookie(MyCookieUtil.createCookie(id, "0"));
			session.setAttribute("loginUser", id);
		}
	
		return "redirect:/quiz12/count";
	}
	
	@GetMapping("/count")
	public String count(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	
		String id = (String) session.getAttribute("loginUser");
		String value = MyCookieUtil.getCookieValue(request, id);
		if (value == null) {
			request.setAttribute("count", 0);
		} else {
			int count = Integer.parseInt(value) + 1;
			request.setAttribute("id", id);
			request.setAttribute("count", count);
			response.addCookie(MyCookieUtil.createCookie(id, String.valueOf(count)));
		}
	
		return "quiz/quiz12/count";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
	
		String id = (String) session.getAttribute("loginUser");
		response.addCookie(MyCookieUtil.createCookieForRemove(id));
		session.setAttribute(id, null);
	
		return "redirect:/quiz12/count";
	}*/

	//count를 session에 저장
	@PostMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		String id = request.getParameter("id");
		session.setAttribute("loginUser", id);
		if (session.getAttribute(id) == null) {
			session.setAttribute(id, 0);
		}

		return "redirect:/quiz12/count";
	}

	@GetMapping("/count")
	public String count(HttpSession session) {

		String id = (String) session.getAttribute("loginUser");
		Object value = session.getAttribute(id);
		if (value != null) {
			int count = (Integer) value + 1;
			session.setAttribute(id, count);
		}

		return "quiz/quiz12/count";
	}

	@GetMapping("/logout")
	public String logout(HttpServletResponse response, HttpSession session) {

		String id = (String) session.getAttribute("loginUser");
		if (id != null) {
			session.setAttribute(id, null);
			session.setAttribute("loginUser", null);
		}

		return "redirect:/quiz12/count";
	}
}
