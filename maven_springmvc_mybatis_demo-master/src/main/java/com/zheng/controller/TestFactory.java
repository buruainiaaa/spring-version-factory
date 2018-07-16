package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("testFactory")
public class TestFactory extends IAbstractFactory {
	@Autowired
	@Qualifier("test0")
	private ITestInteinfce test0;
	@Autowired
	@Qualifier("test1")
	private ITestInteinfce test1;

	@Override
	public ITestInteinfce geTestInteinfce(String version) {
		ITestInteinfce oInteinfce = null;
		switch (version) {
		case "vs1.0":
			oInteinfce = test0;
			break;
		case "vs1.1":
			oInteinfce = test1;
			break;
		default:
			oInteinfce = null;
			break;
		}
		return oInteinfce;
	}

}
