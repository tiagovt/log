package log.log;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@lombok.extern.slf4j.Slf4j
@RestController
public class TesteController {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TesteController.class);

	@RequestMapping(path="teste", method = RequestMethod.GET)
	public String teste() {
		try {
			throw new NumberFormatException("3333");
		} catch (Exception e) {
			log.error("Teste");
			log.error(e.getMessage());
		}
		return "helloWorld!";
	}
}
