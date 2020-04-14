package com.designpatterns.composite;

public class Multiplier extends BinaryExpression {

	public Multiplier(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return left.getValue() * right.getValue();
	}
	

}
