package log.log;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TesteController {
	

	@RequestMapping(path="teste", method = RequestMethod.GET)
	public String teste() {
		try {
			System.out.println("Teste");
			throw new NumberFormatException("3333");
		} catch (Exception e) {
			log.error("Teste");
			log.error(e.getMessage());
		}
		return "helloWorld!";
	}
}
