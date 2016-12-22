package com.gj.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author GJ 
 * @date 2016年12月19日 上午9:34:13 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class App {
	
	public static void main(String[] args) {
		RealRole rr = new RealRole();
		ProxyRole pr = new ProxyRole(rr);
		
		ClassLoader loader = rr.getClass().getClassLoader();
		Class<?>[] interfaces = rr.getClass().getInterfaces();
		InvocationHandler h = pr;
		Object newProxyInstance = Proxy.newProxyInstance(loader, interfaces, h);
		
		((Behaviour)newProxyInstance).doSomething();
		((eating)newProxyInstance).eating();
	}
}
