package fr.dauphine.ja.daillethomas.shapes;

import java.util.ArrayList;

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
	
	public boolean isSameAs(Point p) {	
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
	
	@Override
	public boolean equals(Object o2) {
		if (!(o2 instanceof Point)) {
			return false;
		}
		
		Point p2 = (Point) o2;
		return x == p2.x && y == p2.y;
	}
	
//	Ajouter une methode translate(dx, dy) a Point. Quelles sont les differentes
//	signatures et possibilitees pour cette methode ?
	
	public void translate(int dx, int dy) {
		x = dx;
		y = dy;
	}

	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println(p.x+" "+p.y);
		System.out.println(p);
		
		//EXERCICE 2
		System.out.println("EXERCICE 2");
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		//q3.
		System.out.println("Question 3");
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}

}
