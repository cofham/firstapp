package example.app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*클래스 애너테이션에 @RequestMapping을 지정 ,/echo 라는 경로에 대한 요청이 매핑됨.*/
@RequestMapping("echo")
public class EchoController {
	/* 입력화면 표시 요청을 처리하는 메서드를 추가, 메서드 애너테이션으로 @RequestMapping을 지정 */
	/* 'GET /echo'라는 요청이 메서드에 매핑*/
	@RequestMapping(method=RequestMethod.GET)
	public String viewInput(Model model) {
		System.out.println("viewInput");
		EchoForm form = new EchoForm();
		/* 폼 객체를 생성하고 모델에 추가 */
		model.addAttribute(form);
		/* 입력화면을 표시하는 JSP의 뷰 이름을 반환 , 'src/main/webapp/WEB-INF/echo/input.jsp'가 호출*/
		return "echo/input";
	}
	
	/* 입력값 전송을 처리하는 메서드를 추가하고 메서드 애너테이션으로 @RequestMapping을 지정*/
	/* 'POST /echo'라는 요청이 이 메서드에 매핑됨 */
	@RequestMapping(method=RequestMethod.POST)
	/* 메서드 매개변수에 폼 클래스를 지정*/
	/* 폼 클래스 인수에 @Valid를 지정, 프런트 컨트롤러는 폼 클래스의 입력값 검사를 하고 검사 결과를 BindingResult에 저장*/
	/* 메서드 매개변수에 BindingResult를 지정해서 폼 클래스의 입력값 검사를 받는다.*/
	public String echo(@Valid EchoForm form,BindingResult result) {
		/* BindingResult의 hasErrors 메서드를 호출해서 입력값 검사에서 오류가 발생하는지 판단한다.*/
		if(result.hasErrors()) {
			/* 오류가 발생하는 경우 다시 입력화면을 반환*/
			return "echo/input";
		}
		/* 출력 화면을 표시하는 JSP의 뷰 이름을 반환*/
		/* src/main/webapp/WEB-INF/echo/output.jsp가 호출*/
		return "echo/output";
	}
}
