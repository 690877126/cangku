package com.gj.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:16:46 
 * @describe 婚庆公司
 */
//Math.random() * (max-min+1) + min

public class WeddingCompany implements InvocationHandler{
	
	private Marry realRole;
	
	public Object bind(Marry realRole) throws InstantiationException, IllegalAccessException {
		this.realRole = realRole;
		
		ClassLoader loader = this.realRole.getClass().getClassLoader();
		Class<?>[] interfaces = this.realRole.getClass().getInterfaces();
		InvocationHandler h = this;
		
		
//		Object ne = Proxy.newProxyInstance(loader,interfaces, h);
		Object ne=  Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class<?>[]{Marry.class} , this);
		//Class<?>[]{Marry.class}
		return ne;
		
	}

	private void before() {
		System.out.println("接新娘");
	}
	
	private void after() {
		System.out.println("入洞房");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		before();
		result = method.invoke(this.realRole, args);
		after();
		return result;
	}
	
	

}
