package com.gj.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:53:20 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class Restaurant implements InvocationHandler {
	
	private Object customer;
	
	public void welcome(Object customer) {
		this.customer = customer;
	}
	
	private void cook() {
		System.out.println("餐馆做饭");
	}
	
	private void clean() {
		System.out.println("餐馆收拾");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		cook();
		method.invoke(this.customer, args);
		clean();
		return null;
	}

}
