package example.app;

import java.io.Serializable;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
public class EchoForm implements Serializable{
	private static final long serialVersionUID = 1115232259783191726L;;
	
	/* 필수값 검사를 하기 위해 Hibernate Validator가 제공하는 @NotEmpty를 지정*/
	@NotEmpty
	/* 최대 문자 수 검사를 하기 위해 Bean Validation이 제공하는 @Size를 지정*/
	@Size(max=100)
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
