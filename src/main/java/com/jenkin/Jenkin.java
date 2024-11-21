package com.jenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/get")
public class Jenkin {
	
   @GetMapping(value="/ggt")
public String ggt(String a) {
	return "helloworld";
}
}
