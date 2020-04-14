package com.designpatterns.composite;

public class Subtractor extends BinaryExpression {

	public Subtractor(Expression left, Expression right) {
		// TODO Auto-generated constructor stub
		super(left, right);
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return left.getValue()-right.getValue();
	}

}
