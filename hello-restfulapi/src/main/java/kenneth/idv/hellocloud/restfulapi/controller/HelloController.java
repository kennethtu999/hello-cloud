package kenneth.idv.hellocloud.restfulapi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** Hello Controller */
@RestController
public class HelloController {

	/** say hello */
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String helloCloud() {
		return "Hello Cloud";
	}

}
