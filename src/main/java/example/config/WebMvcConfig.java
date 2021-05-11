package example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration	/*DispatcherServlet용 설정 클래스를 작성*/
@EnableWebMvc	/*클래스에 @EnableWebMvc를 지정*/
@ComponentScan("example.app")	/*클래스에 @ComponentScan을 지정*/
/*부모 클래스로 WebMvcConfigurerAdapter 클래스를 지정*/
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	
	/*configureViewResolvers 메서드를 오버라이드*/
	@Override	
	public void configureViewResolvers(ViewResolverRegistry registry) {
		/*VoewResolverRegistry 클래스의 jsp 메서드를 호출해서 JSP용 ViewResolver를 설정 */
		registry.jsp();
	}
	
}
