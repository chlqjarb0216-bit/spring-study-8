<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.ad-display-hide {
	display: none;
}
</style>

</head>
<body>
	<h1>hideAd page</h1>
	<c:if test="${ !antiAd }">
		<form action="" method="post" id="adForm">
			<h2>★★★★★</h2>
			<h2>앗! 이 페이지는 광고를 무료로 보여줍니다!</h2>
			<h2>별이 다섯개</h2>
			<h2>★★★★★</h2>
			<label for="chk_hide">24시간 광고제거 무료<input type="checkbox"
				name="antiAd" id="chk_hide" /></label>
			<button type="submit">닫기</button>
		</form>
	</c:if>
	<p>해당 페이지 표시 내용</p>
	<c:if test="${ antiAd }">
		<form action="/quiz13/reAd">
			<p>광고가 다시 보고 싶습니다...</p>
			<button type="submit">광고다시보기</button>
		</form>
	</c:if>

	<script>
		const adForm = document.getElementById('adForm');
		const chkHide = document.getElementById('chk_hide');
		
		adForm.addEventListener('submit', (e)=>{
			e.preventDefault();
			
			//체크박스 O -> form 요청 -> 서버로 post -> 서버에서 쿠키 생성
			//체크박스 X -> 화면에서 css, js 로 자체적으로 안보이도록 처리 -> display:none; 방식
			
			if(chkHide.checked){	//check O
				adForm.submit();
			}else{	//check X
				adForm.classList.add('ad-display-hide');
			}
		})
	</script>
</body>
</html>