package com.lotustechblog.tutorial1;

public class Multiplier {
	private int product;
	
	public Multiplier(){
		this.product = 0;
	}
	
	public void multiply(int x , int y){
		product = x * y;
	}
	
	public int getResult(){
		return product;
	}
}
