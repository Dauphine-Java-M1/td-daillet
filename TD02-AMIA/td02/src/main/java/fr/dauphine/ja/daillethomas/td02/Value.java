package fr.dauphine.ja.daillethomas.td02;

public class Value extends Expr {

	public Value(double val) {
		super.val = val;
	}
	
	@Override
	public double eval() {
		return super.val;
	}
	
}
