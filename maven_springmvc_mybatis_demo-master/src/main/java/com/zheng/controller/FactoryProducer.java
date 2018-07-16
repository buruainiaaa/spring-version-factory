package com.zheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FactoryProducer {
	@Autowired
	@Qualifier("userFactory")
	private IAbstractFactory userFactory;
	@Autowired
	@Qualifier("testFactory")
	private IAbstractFactory testFactory;

	public IAbstractFactory getFactory(String type) {
		IAbstractFactory oAbstractFactory = null;
		switch (type) {
		case "test":
			oAbstractFactory = testFactory;
			break;
		case "user":
			oAbstractFactory = userFactory;
			break;
		default:
			break;
		}
		return oAbstractFactory;
	}
}
