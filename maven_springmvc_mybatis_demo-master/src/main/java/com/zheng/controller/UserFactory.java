package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userFactory")
public class UserFactory extends IAbstractFactory {
	@Autowired
	@Qualifier("user0")
	private IUserInteinfce user0;
	@Autowired
	@Qualifier("user1")
	private IUserInteinfce user1;

	@Override
	public IUserInteinfce getUserInteinfce(String version) {
		IUserInteinfce oInteinfce = null;
		switch (version) {
		case "vs1.0":
			oInteinfce = user0;
			break;
		case "vs1.1":
			oInteinfce = user1;
			break;
		default:
			oInteinfce = null;
			break;
		}
		return oInteinfce;
	}

}
