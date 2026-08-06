package com.app.controller.study.quiz.quiz07;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/quiz07")
public class Quiz07Controller {

	@GetMapping("/listTest")
	public String listTest(@RequestParam String type, Model model) {

		model.addAttribute("type", type);

		List<Object> carrigeList = new ArrayList<>();

		if (type.equals("member")) {
			for (int i = 1; i <= 5; i++) {
				carrigeList.add(new MemberDTO("아이디" + i, "비번" + i, "이름" + i));
			}
		} else {
			for (int i = 0; i < 10; i++) {
				carrigeList.add("스트링 리스트입니다.");
			}
		}

		model.addAttribute("carrigeList", carrigeList);

		return "quiz/quiz07/list";
	}

}
