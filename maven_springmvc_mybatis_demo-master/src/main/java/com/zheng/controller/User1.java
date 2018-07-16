package com.zheng.controller;

import org.springframework.stereotype.Service;

@Service
public class User1 extends User0 {

	@Override
	public String getIndex2() {
		return "------this is User1 getIndex2 mothod--------";
	}

	@Override
	public String getIndex3() {
		return "---------this is User1 getIndex3 mothod---------";
	}

	@Override
	public String getIndex4() {
		return "-------this is User1 getIndex4 mothod----------";
	}
}
