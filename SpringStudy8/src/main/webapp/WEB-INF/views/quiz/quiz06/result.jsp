<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BMI Calculator</h1>

	<div>
		<h2>이름: ${bmi.name}</h2>
		<h2>키: ${bmi.height}(cm)</h2>
		<h2>몸무게: ${bmi.weight}(kg)</h2>
		<br />
		<h2>신체질량지수(BMI) = 체중(kg)/신장(m)/신장(m) = ${bmi.bmiR2}</h2>
	</div>
</body>
</html>