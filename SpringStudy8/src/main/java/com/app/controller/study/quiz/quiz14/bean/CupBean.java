package com.app.controller.study.quiz.quiz14.bean;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CupBean {

	CoffeeBean coffeeBean;

	@Override
	public String toString() {
		return "컵에 담긴 음료의 이름 - " + coffeeBean.toString();
	}

}
