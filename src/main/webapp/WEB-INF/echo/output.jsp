<html>
	<body>
		<h2>출력 화면</h2>
		<div>
			<!-- 폼 객체에 저장된 입력값을 텍스트에 표시 -->
			<!-- JSTL의 c:out요소를 사용해 EchoForm의 text 속성값을 HTML로 출력 -->
			입력한 텍스트는 '<span><c:out value="${echoForm.text }"/></span>'입니다.
		</div>
		<br>
		<div>
			<a href="<c:url value='/' />">최상위 페이지로 이동</a>
		</div>
	</body>
</html>