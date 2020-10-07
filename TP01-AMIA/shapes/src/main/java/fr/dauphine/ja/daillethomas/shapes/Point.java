package fr.dauphine.ja.daillethomas.shapes;

public class Point {
	
	private int x,y;
	private static int cpt;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		cpt ++;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		cpt ++;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println(p.x+" "+p.y);
		System.out.println(p);
	}

}
