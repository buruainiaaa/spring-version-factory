package com.zheng.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextsUtil implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public Object getBean(String beanName) {

		try {
			return applicationContext.getBean(beanName);
		} catch (NoSuchBeanDefinitionException e) {
			return null;
		}
	}

	public <T> T getBean(String beanName, Class<T> clazs) {
		return clazs.cast(getBean(beanName));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getContext() {
		return applicationContext;
	}

}
