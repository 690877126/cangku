package com.gj.oneDragon;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.crypto.CipherInputStream;

/**
 * @author GJ
 * @date 2016年12月18日 下午8:17:18
 * @describe
 */
// Math.random() * (max-min+1) + min

public class Club implements InvocationHandler {

	public Object customer;

	public void welcome(Object customer) {
		this.customer = customer;
	}

	public void before(String methodName) {
		switch (methodName) {
		case "playPoker":
			pokerBefore();
			break;
		case "playMahjong":
			mahjongBefore();
			break;
		case "eatChineseFood":
			chineseFoodBefore();
			break;
		case "eatWesternFood":
			westernFoodBefore();
			break;
		}
	}

	public void after(String methodName) {
		switch (methodName) {
		case "playPoker":
			pokerAfter();
			break;
		case "playMahjong":
			mahjongAfter();
			break;
		case "eatChineseFood":
			chineseFoodAfter();
			break;
		case "eatWesternFood":
			westernFoodAfter();
			break;
		}
	}

	/**
	 * 吃西餐
	 */
	public void westernFoodBefore() {
		System.out.println("厨师瞬间煎牛排三分熟");
	}

	public void westernFoodAfter() {
		System.out.println("还得给小费");
	}

	/**
	 * 吃中餐
	 */
	public void chineseFoodBefore() {
		System.out.println("厨师开油锅");
	}

	public void chineseFoodAfter() {
		System.out.println("拍拍屁股走人");
	}

	/**
	 * 打扑克
	 */
	public void pokerBefore() {
		System.out.println("洗牌");
	}

	public void pokerAfter() {
		System.out.println("爆了");
	}

	/**
	 * 搓麻将
	 */
	public void mahjongBefore() {
		System.out.println("砌长城");
	}

	public void mahjongAfter() {
		System.out.println("胡了");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		before(methodName);
		method.invoke(customer, args);
		after(methodName);
		
		return null;
	}

}
