package com.app.controller.study.quiz.quiz14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.controller.study.quiz.quiz14.bean.CupBean;
import com.app.controller.study.quiz.quiz14.bean.PlateBean;

@Controller
@RequestMapping("/quiz14")
public class Quiz14Controller {

	//의존성 주입

	@Autowired
	CupBean cupBean;

	@Autowired
	PlateBean plateBean;

	@GetMapping("/fullOrder")
	public String fullOrder(Model model) {

		System.out.println(cupBean);
		System.out.println(plateBean);
		model.addAttribute("cupBean", cupBean);
		model.addAttribute("plateBean", plateBean);

		return "quiz/quiz14/order";
	}

	@GetMapping("/orderCoffee")
	public String orderCoffee(Model model) {

		System.out.println(cupBean);
		model.addAttribute("cupBean", cupBean);

		return "quiz/quiz14/order";
	}

	@GetMapping("/orderDessert")
	public String orderDessert(Model model) {

		System.out.println(plateBean);
		model.addAttribute("plateBean", plateBean);

		return "quiz/quiz14/order";
	}
}
