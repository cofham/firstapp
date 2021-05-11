<html>
	<body>
		<h2>입력 화면</h2>
		<!-- 스프링 MVC에서 제공되는 form:form을 사용해 HTML폼을 작성 -->
		<!-- modelAttribute 속성에 폼 객체의 속성명을 지정 -->
		<form:form modelAttribute="echoForm">
			<div>
				텍스트를 입력해주세요:
			</div>
			<div>
				<!-- 스프링 MVC에서 제공되는 form:input을 사용해 텍스트 필드를 작성 -->
				<!-- path 속성에 modelAttribute 속성에서 지정한 객체 프로퍼티명을 지정 -->
				<form:input path="text"/>
				<!-- 스프링 MVC에서 제공되는 form:errors를 사용해 오류 정보를 출력하는 HTML을 출력 -->
				<!-- path 속성에 modelAttribute 속성에서 지정한 객체 프로퍼티명을 지정 -->
				<form:errors path="text"/>
			</div>
			<div>
				<!-- 스프링 MVC에서 제공되는 form:button요소를 사용해 HTML 폼의 전송 버튼을 만든다. -->
				<form:button>전송</form:button>
			</div>
		</form:form>
	</body>
</html>