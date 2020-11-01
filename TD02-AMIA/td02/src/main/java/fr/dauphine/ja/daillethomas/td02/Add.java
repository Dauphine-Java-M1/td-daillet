package fr.dauphine.ja.daillethomas.td02;

public class Add extends Expr {
	private Value val1;
	private Expr expr;
	
	public Add(Value val, Expr expr) {
		this.val1 = val;
		this.expr = expr;
	}
	
	@Override
	public double eval() {
		double total = super.val + expr.getVal() + val1.eval();
		super.val = total;
		return total;
	}

	@Override
	public String toString() {
		return val1+" + "+expr;
	}
	
}
