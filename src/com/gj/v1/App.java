package com.gj.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:21:34 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class App {
	
	public static void main(String[] args) throws Exception {
		//创建真实角色对象
		People p = new People("二狗子");
		//创建代理角色
		WeddingCompany wc = new WeddingCompany();
		
		Object obj=wc.bind(p);
		
		System.out.println(obj.getClass());
		System.out.println(WeddingCompany.class);
		System.out.println(People.class);
		//Marry m=(Marry)obj;
		
	//	m.marry();
		
		
		
		//Method method = obj.getClass().getMethod("marry");
		//method.invoke(obj);
		
		
		
		
		
	}
}
