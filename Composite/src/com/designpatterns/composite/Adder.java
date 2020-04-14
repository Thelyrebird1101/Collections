package com.designpatterns.composite;

public class Adder extends BinaryExpression {

	private double valueA;
	private double valueB;

	public Adder(Expression left, Expression right) {
		// TODO Auto-generated constructor stub
		super(left,right);
		}

	public double getValue() {
		// TODO Auto-generated method stub
		return this.left.getValue()
				+ this.right.getValue();
	}
	

}
