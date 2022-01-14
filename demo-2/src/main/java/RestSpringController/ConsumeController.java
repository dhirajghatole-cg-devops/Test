package RestSpringController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ConsumeController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Dhiraj");
		return "Dhiraj"; 
		
		
	}
}