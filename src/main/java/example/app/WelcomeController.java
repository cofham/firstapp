package example.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*컨트롤러 클래스에 @Controller 애너테이션을 지정 */
@Controller
public class WelcomeController {
	/* 최상위 페이지 표시 요청을 처리하는 메서드를 추가하고 메서드 애너테이션으로서 @RequestMapping을 지정*/
	/* value 속성에 '/' 를 지정해 '/' 경로에 대한 요청이 이 메서드에 매핑되게 만든다.*/
	@RequestMapping("/")
	public String home() {
		System.out.println("home");
		/* 최상위 페이지를 표시하는 JSP의 뷰 이름을 반환 */
		/* src/main/webapp/WEB-INF/index.jsp가 호출*/
		return "index";
	}
}
