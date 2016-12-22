package com.gj.oneDragon;

/** 
 * @author GJ 
 * @date 2016年12月18日 下午8:06:23 
 * @describe 
 */
//Math.random() * (max-min+1) + min

public class People implements Eating,Playing{

	private String name;

	public People(String name) {
		super();
		this.name = name;
	}

	@Override
	public void playPoker() {
		System.out.println("玩21点");
	}

	@Override
	public void playMahjong() {
		System.out.println("打麻将");
	}

	@Override
	public void eatChineseFood() {
		System.out.println("吃糖醋排骨");
	}

	@Override
	public void eatWesternFood() {
		System.out.println("吃牛排");
	}
}
