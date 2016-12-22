package com.gj.oneDragon;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午8:28:56 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class App {

	public static void main(String[] args) {
		People p = new People("GJ");
		Club c = new Club();
		c.welcome(p);
		
		
		ClassLoader loader = p.getClass().getClassLoader();
		Class<?>[] interfaces = p.getClass().getInterfaces();
		Object newProxyInstance = Proxy.newProxyInstance(loader, interfaces, c);
		Eating e = (Eating) newProxyInstance;
		e.eatWesternFood();
		e.eatChineseFood();
		
		Playing play = (Playing) newProxyInstance;
		play.playMahjong();
		play.playPoker();
	}
}
