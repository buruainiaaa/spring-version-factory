package com.zheng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController implements IUserInteinfce {

	@Autowired
	private FactoryProducer factoryProducer;

	@RequestMapping("drow")
	@ResponseBody
	public String drow(HttpServletRequest req, HttpServletResponse response) {
		String version = req.getHeader("version");
		String string = factoryProducer.getFactory("user").getUserInteinfce(version).getIndex1();
		string += factoryProducer.getFactory("user").getUserInteinfce(version).getIndex2();
		string += factoryProducer.getFactory("user").getUserInteinfce(version).getIndex3();
		string += factoryProducer.getFactory("user").getUserInteinfce(version).getIndex4();

		return string;
	}
}
