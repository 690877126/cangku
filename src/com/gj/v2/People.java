package com.gj.v2;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:52:23 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class People implements Eating {
		
	private String name;
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eating() {
		System.out.println(this.name + "在吃饭");
	}

	@Override
	public void play() {
		System.out.println("playing");
	}
	
	
}
