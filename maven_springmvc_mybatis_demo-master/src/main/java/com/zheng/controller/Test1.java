package com.zheng.controller;

import org.springframework.stereotype.Service;

@Service
public class Test1 extends Test0 {

	@Override
	public String draw1() {
		return "-------this is test1 draw1 mothod-------";
	}

	@Override
	public String draw2() {
		return "---------this is test1 draw2 mothod-----";
	}

	@Override
	public String draw4() {
		return "--------this is test1 draw4 mothod-----------";
	}
}
