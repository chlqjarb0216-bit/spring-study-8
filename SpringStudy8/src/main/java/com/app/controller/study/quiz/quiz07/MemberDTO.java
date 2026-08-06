package com.app.controller.study.quiz.quiz07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberDTO {
	String id;
	String pw;
	String name;

	@Override
	public String toString() {
		return id + " " + pw + " " + name;
	}
}
