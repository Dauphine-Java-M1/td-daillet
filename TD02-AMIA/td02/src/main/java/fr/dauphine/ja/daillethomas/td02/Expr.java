package fr.dauphine.ja.daillethomas.td02;

public class Expr {
	
	protected double val;

	public double eval() {
		return val;
	}
	
	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return ""+val+"";
	}
	
	
}
