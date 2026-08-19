<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>관리자페이지</h1>
	<h2>rooms 객실 목록</h2>

	<div>
		<form action="" method="get">
			<h2>검색기준</h2>

			<label for="">
				건물명 :
				<input type="text" name="buildingName"
					value="${ roomSearchCondition.buildingName }" />
			</label>

			<h4>뷰타입</h4>
			<select name="viewType">
				<option value="">선택없음</option>
				<option value="OCN"
					<c:if test="${ roomSearchCondition.viewType=='OCN' }">selected</c:if>>오션뷰</option>
				<option value="CTY"
					<c:if test="${ roomSearchCondition.viewType=='CTY' }">selected</c:if>>시티뷰</option>
				<option value="MOT"
					<c:if test="${ roomSearchCondition.viewType=='MOT' }">selected</c:if>>마운틴뷰</option>
			</select>
			<br>
			<button type="submit">검색</button>
		</form>
	</div>
	<br />
	<br />
	<div>
		<button id="btn_registerRoom">객실 추가하기</button>
	</div>

	<c:forEach var="room" items="${ roomList }">
		<p>
			<a href="/admin/room/${ room.roomId }"> ${ room.roomId } ${ room.buildingName }
				${ room.roomNumber } ${ room.floor } ${ room.maxGuestCount } <c:choose>
					<c:when test="${ room.viewType == 'OCN' }">오션뷰</c:when>
					<c:when test="${ room.viewType == 'CTY' }">시티뷰</c:when>
					<c:when test="${ room.viewType == 'MOT' }">마운틴뷰</c:when>
				</c:choose>
			</a>

			<%-- 			<button type="button" onclick="location.href='admin/removeRoom?roomId=${room.roomId}'">삭제하기</button> --%>
			<button type="button" onclick="removeRoom(${room.roomId})">삭제하기</button>
			<button type="button" onclick=" modifyRoom(${room.roomId}) ">수정하기</button>
		</p>
	</c:forEach>

	<script>
		document.getElementById('btn_registerRoom').addEventListener('click', ()=>{
			location.href = "/admin/registerRoom";
		})
		
		function removeRoom(roomId) {
			if(confirm("정말 삭제하시겠습니까?")){
				location.href='/admin/removeRoom?roomId='+roomId;
			}
		}
		
		function modifyRoom( roomId ){
			location.href = '/admin/modifyRoom?roomId=' + roomId;
		}
	</script>
</body>
</html>