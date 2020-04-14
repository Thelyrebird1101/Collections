package com.designpatterns.composite;

public class Constant implements Expression {
	
	private double value;

	public Constant( double value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
