package com.gj.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @author GJ 
 * @date 2016年12月19日 上午9:33:25 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class ProxyRole implements InvocationHandler{
	
	private Object realRole;

	public ProxyRole(Object realRole) {
		super();
		this.realRole = realRole;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		method.invoke(realRole, args);
		return null;
	}

}
