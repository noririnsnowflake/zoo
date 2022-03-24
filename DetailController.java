package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.DetailForm;

@Controller
public class DetailController {


	@GetMapping("/edit")
	public String detail(DetailForm detailForm) {
	  return "edit.html";
	}
}
