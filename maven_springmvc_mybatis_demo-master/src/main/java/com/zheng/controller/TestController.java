package com.zheng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {

	@Autowired
	private FactoryProducer factoryProducer;

	@RequestMapping("getIndex")
	@ResponseBody
	public String getIndex(HttpServletRequest req, HttpServletResponse response) {
		String version = req.getHeader("version");
		String string = factoryProducer.getFactory("test").geTestInteinfce(version).draw1();
		string += factoryProducer.getFactory("test").geTestInteinfce(version).draw2();
		string += factoryProducer.getFactory("test").geTestInteinfce(version).draw3();
		string += factoryProducer.getFactory("test").geTestInteinfce(version).draw4();

		return string;
	}
}
