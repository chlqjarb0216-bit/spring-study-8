package com.app.controller.study.quiz.quiz06;

import lombok.Data;

@Data
public class BmiDTO {
	String name;
	double height;
	double weight;

	public double getBmi() {
		return weight / height / height * 10000;
	}

	public String getBmiR2() {
		return String.format("%.2f", getBmi());
	}

}
