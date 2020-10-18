package fr.dauphine.ja.daillethomas.shapes;

//Ecrire une classe Circle, defini comme etant un point (centre) et un rayon, ainsi
//que son constructeur.

public class Circle {
	
	private Point centre;
	private int rayon;
	
	public Circle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", rayon=" + rayon + ", surface=" + this.surface()+"]";
	}
	
//	Ecrire une methode translate(dx, dy) qui translate un cercle.
	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}
	
	public Point getCenter() {
		return centre;
	}
	
	public double surface() {
		return (Math.PI * rayon * rayon);
	}
	
//	Creer une methode contains(Point p) indiquant si le point p est contenu dans
//	le cercle (indice: utiliser pythagore).
	
	public boolean contains(Point p) {
		return Math.sqrt(Math.pow(p.getX() - centre.getX(),2) + Math.pow(p.getY() - centre.getY(),2)) <= rayon;
	}
	
//	Creer la methode contains(Point p, Circle...circles) qui renvoit vrai si le
//	point est dans un des cercles. Doit-on en faire une methode statique ?
	
	public static boolean contains(Point p, Circle...circles) {
		
		for(Circle c:circles) {
			if(c.contains(p)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	public static void main(String[] args) {
		
		Point p = new Point(1,2);
//		Point p2 = new Point(1,2);
		Point p3 = new Point(1,3);
		Point p4 = new Point(1,4);
		Point p5 = new Point(2,2);
		Point p6 = new Point(3,3);
		
		Circle c = new Circle(p,1);
		Circle c2 = new Circle(p5,1);
		Circle c3 = new Circle(p6,1);
		Circle c4 = new Circle(p3,1);
		c2.translate(1,1);
//		System.out.println(c+" "+c2);
		
//		Circle c5 = new Circle(new Point(1,2), 2);
//		System.out.println(c3);
//		c5.getCenter().translate(1,1);
//		System.out.println(c3);
//		
//		System.out.println(c);
//		System.out.println(c.contains(p3));
//		System.out.println(c.contains(p4));
		
		System.out.println(contains(p4,c,c2,c3,c4)); //false, false, false, true
		
	}

	

	
	

}
