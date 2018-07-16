package com.zheng.controller;

import org.springframework.stereotype.Service;

@Service
public class Test0 implements ITestInteinfce {

	@Override
	public String draw1() {
		return "-------this is test0 draw1 mothod---------";
	}

	@Override
	public String draw2() {
		return "------------this is test0 draw2 mothod------------";
	}

	@Override
	public String draw3() {
		return "--------this is test0 draw3 mothod--------";
	}
}
