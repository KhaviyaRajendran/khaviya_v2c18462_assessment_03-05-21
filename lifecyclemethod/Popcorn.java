package com.springcore.lifecyclemethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Popcorn  implements InitializingBean,DisposableBean{
	private int price;
	 
	public int getPrice() {
	return price;
	}
	 
	public void setPrice(int price) {
	this.price = price;
	}
	 
	public Popcorn(int price) {
	super();
	this.price = price;
	}
	 
	public Popcorn() {
	super();
	// TODO Auto-generated constructor stub
	}
	 
	@Override
	public String toString() {
	return "Popcorn [price=" + price + "]";
	}
	 
	public void afterPropertiesSet() throws Exception {
	System.out.println("Initialize started");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy end");
	}
}
