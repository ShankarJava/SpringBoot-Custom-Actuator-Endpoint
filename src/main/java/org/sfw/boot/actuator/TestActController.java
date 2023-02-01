package org.sfw.boot.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TAC")
public class TestActController {
	@GetMapping("/ep")
	public String handleRequest() {

		return "SPRING BOOT ROCKS";
	}
}
