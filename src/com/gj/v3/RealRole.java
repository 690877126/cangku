package com.gj.v3;

/** 
 * @author GJ 
 * @date 2016年12月19日 上午9:32:46 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class RealRole implements Behaviour,eating{

	@Override
	public void doSomething() {
		System.out.println("doing ...");
	}

	@Override
	public void eating() {
		System.out.println("eating");
	}

}
