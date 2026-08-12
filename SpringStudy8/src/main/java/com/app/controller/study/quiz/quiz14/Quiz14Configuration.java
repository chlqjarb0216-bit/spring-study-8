package com.app.controller.study.quiz.quiz14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.controller.study.quiz.quiz14.bean.CoffeeBean;
import com.app.controller.study.quiz.quiz14.bean.CupBean;
import com.app.controller.study.quiz.quiz14.bean.DessertBean;
import com.app.controller.study.quiz.quiz14.bean.PlateBean;

@Configuration
public class Quiz14Configuration {

	//Bean 등록 설정
	@Bean
	public CoffeeBean coffeeBean() {
		return new CoffeeBean();
	}

	@Bean
	public CupBean cupBean(CoffeeBean coffeeBean) {
		return new CupBean(coffeeBean);
	}

	@Bean
	public DessertBean dessertBean() {
		return new DessertBean();
	}

	@Bean
	public PlateBean plateBean(DessertBean dessertBean) {
		return new PlateBean(dessertBean);
	}

}
