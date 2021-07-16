package kenneth.idv.hellocloud.restfulapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

/** Hello Controller */
@RestController
@Log
public class HelloController {

	/** say hello */
	@GetMapping(path="/")
	public String helloCloud() {
		log.info("display hello cloud");
		return "Hello Cloud v1";
	}

}
