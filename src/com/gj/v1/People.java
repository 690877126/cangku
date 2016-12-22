package com.gj.v1;

import javax.swing.plaf.synth.SynthSeparatorUI;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午7:14:54 
 * @describe 真实角色
 */
//Math.random() * (max-min+1) + min

public class People implements Marry{

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
	public void marry() {
		System.out.println(this.name + "结婚");
	}

}
