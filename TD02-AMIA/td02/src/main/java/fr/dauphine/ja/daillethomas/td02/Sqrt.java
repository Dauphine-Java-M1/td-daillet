package fr.dauphine.ja.daillethomas.td02;

public class Sqrt extends Expr {
	private Expr expr;

	public Sqrt(Expr expr) {
		this.expr = expr;
	}
	
	@Override
	public double eval() {
		double total = Math.sqrt(expr.val);
		super.val = total;
		return total;
	}

	@Override
	public String toString() {
		return "\u221a (" + expr + ")";
	}
	
	

}
