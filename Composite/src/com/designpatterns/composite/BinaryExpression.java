package com.designpatterns.composite;

abstract public class BinaryExpression implements Expression {

	protected Expression right;
	protected Expression left;

	
	public BinaryExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
		
	}

}
