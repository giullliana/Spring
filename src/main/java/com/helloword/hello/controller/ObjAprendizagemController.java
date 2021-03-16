package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ObjAprendizagem")
public class ObjAprendizagemController {
   @GetMapping
   public String ObjAprendizagem() {
	   return"Entender Spring";
   }
}
