package com.app.controller.study.quiz.quiz11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz11")
public class Quiz11Controller {

	@GetMapping("/first")
	public String first(Model model) {

		if (model.getAttribute("accessUrl") == null) {
			model.addAttribute("accessUrl", "/first");
		}

		return "quiz/quiz11/targetPage";
	}

	@GetMapping("/firsthide1")
	public String firsthide1(Model model) {

		model.addAttribute("accessUrl", "/firsthide1");

		return "quiz/quiz11/targetPage";
	}

	@GetMapping("/firsthide2")
	public String firsthide2(Model model) {
		return "redirect:/quiz11/first";
	}

	@GetMapping("/firsthide3")
	public String firsthide3(Model model, RedirectAttributes ra) {

		ra.addFlashAttribute("accessUrl", "/firsthide3");

		return "redirect:/quiz11/first";
	}

	//	@GetMapping("/first")
	//	public String firstSession(Model model, HttpSession session) {
	//
	//		if (session.getAttribute("accessUrl") == null) {
	//			model.addAttribute("accessUrl", "/first");
	//		} else {
	//			model.addAttribute("accessUrl", session.getAttribute("accessUrl"));
	//			session.invalidate();
	//		}
	//
	//		return "quiz/quiz11/targetPage";
	//	}
	//
	//	@GetMapping("/firsthide3")
	//	public String firsthide3session(Model model, HttpSession session) {
	//
	//		session.setAttribute("accessUrl", "/firsthide3");
	//
	//		return "redirect:/quiz11/first";
	//	}

}
