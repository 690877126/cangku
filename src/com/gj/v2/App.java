package com.gj.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:55:32 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class App {

	public static void main(String[] args) {
		People p = new People("张三");
		Restaurant r = new Restaurant();
		r.welcome(p);
		
		ClassLoader loader = p.getClass().getClassLoader();
		Class<?>[] interfaces = p.getClass().getInterfaces();
		InvocationHandler h = r;
		Eating newProxyInstance = (Eating) Proxy.newProxyInstance(loader, interfaces, h);
		
		newProxyInstance.eating();
		newProxyInstance.play();
	}
}
