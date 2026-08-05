package com.app.controller.study.quiz.quiz06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz06")
public class Quiz06Controller {

	@GetMapping("/ask-bmi")
	public String ask() {
		return "quiz/quiz06/ask";
	}

	//	@PostMapping("/result-bmi")
	//	public String result(@RequestParam(required = false) String name, @RequestParam double height,
	//			@RequestParam double weight, Model model) {
	//
	//		model.addAttribute("name", name);
	//		model.addAttribute("height", height);
	//		model.addAttribute("weight", weight);
	//
	//		double heightByM = height / 100;
	//		double bmi = weight / heightByM / heightByM;
	//		String roundedBMI = String.format("%.2f", bmi);
	//		model.addAttribute("bmi", roundedBMI);
	//
	//		return "quiz/quiz06/result";
	//	}

	@PostMapping("/result-bmi")
	public String result(@ModelAttribute("bmi") BmiDTO bmi) {

		return "quiz/quiz06/result";
	}

}
