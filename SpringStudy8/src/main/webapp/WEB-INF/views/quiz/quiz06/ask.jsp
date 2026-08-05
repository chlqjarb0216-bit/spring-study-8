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
		<form action="/quiz06/result-bmi" method="post">
			name : <input type="text" name="name"><br> height(cm) : <input
				type="text" name="height"><br>weight(kg) : <input
				type="text" name="weight"><br>
			<button type="submit">확인하기</button>
		</form>

	</div>
</body>
</html>