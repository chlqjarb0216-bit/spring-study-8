package com.app.controller.study.quiz.quiz14.bean;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlateBean {

	DessertBean dessertBean;

	@Override
	public String toString() {
		return "접시에 담긴 디저트의 이름 - " + dessertBean.toString();
	}

}
