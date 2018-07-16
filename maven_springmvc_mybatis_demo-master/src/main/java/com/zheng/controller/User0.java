package com.zheng.controller;

import org.springframework.stereotype.Service;

@Service
public class User0 implements IUserInteinfce {

	@Override
	public String getIndex1() {
		return "-----this is User0 getIndex1 mothod----";
	}

	@Override
	public String getIndex3() {
		return "--------this is User0 getIndex3 mothod---------";
	}

	@Override
	public String getIndex4() {
		return "-------this is User0 getIndex4 mothod------";
	}

}
