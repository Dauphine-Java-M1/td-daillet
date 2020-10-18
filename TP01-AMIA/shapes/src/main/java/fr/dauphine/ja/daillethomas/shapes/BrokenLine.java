package fr.dauphine.ja.daillethomas.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BrokenLine {
	
	private int  nbMax;
	//private Point[] tab;
	private LinkedList<Point> tab;


//	public BrokenLine(int nbMax, Point[] tab) {
//		
//		if (tab.length > nbMax) {
//			throw new IllegalArgumentException("Votre tableau est plus grand que le nombre maximum de point que vous autorisés.");
//		}
//		
//		this.nbMax = nbMax;
//		this.tab = tab;
//
//	}
	
	public BrokenLine(int nbMax, LinkedList<Point> tab) {
	
		if (tab.size() > nbMax) {
			throw new IllegalArgumentException("Votre tableau est plus grand que le nombre maximum de point que vous autorisés.");
		}
		
		this.nbMax = nbMax;
		this.tab = tab;

	}
	

//	public void add (Point p) {
//		
//		if(tab.length + 1 > nbMax) {
//			throw new IllegalArgumentException("Vous avez atteind la capacité maximum de votre ligne brisée.");
//        } 
//		tab = Arrays.copyOf(tab, tab.length + 1);
//		tab[tab.length - 1] = p;
//	}
	
	public void add (Point p) {
		
		if(tab.size() + 1 > nbMax) {
			throw new IllegalArgumentException("Vous avez atteind la capacité maximum de votre ligne brisée.");
        } 
		
		tab.add(p);
	}
	
//	Ecrire une methode pointCapacity() et nbPoints() indiquant la capacite de la
//	ligne brisee et le nombre de points actuellement sur la ligne.

	public int pointCapacity() {
		return nbMax;
	}
	
	public int nbPoints() {
//		return tab.length;
		return tab.size();
	}
	
//	Ecrire une methode contains indiquant si un point passe en argument est contenu
//	dans la ligne brisee. Vous utiliserez pour cela une boucle for each et non une
//	boucle classique.
	
	public boolean contains(Point p) {
		
		for(Point point : tab) {
			if(point.equals(p)) {
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public String toString() {
//		return "BrokenLine [nbMax=" + nbMax + ", tab=" + Arrays.toString(tab) + "]";
//	}
	
	@Override
	public String toString() {
		return "BrokenLine [nbMax=" + nbMax + ", tab=" + tab + "]";
	}
	
	public static void main(String[] args) {
		
		int nb_max = 4;
		
		Point p0=new Point(0,0);
		Point p1=new Point(1,1);
		Point p2=new Point(2,2);
//		Point p3=new Point(3,3);
		Point p4=new Point(4,4);
//		Point[] tab  = new Point[] {p0,p1,p2};
		
		LinkedList<Point> lk  = new LinkedList<Point>(); 
		lk.add(p0); 
		lk.add(p1); 
		lk.add(p2); 

//		BrokenLine brl = new BrokenLine(nb_max,tab);
		BrokenLine brl = new BrokenLine(nb_max,lk);
		System.out.println(brl);
		System.out.println("capacity :"+brl.pointCapacity());
		System.out.println("nb point :"+brl.nbPoints());
		System.out.println("brl contient p1 ? "+brl.contains(p1));
		System.out.println("brl contient p4 ? "+brl.contains(p4));
		
//		Que se passe t-il si null est passe en argument a la methode contains
//		? Et si on a fait un add(null) avant ? Regarder la documentation de
//		Objects.requireNonNull(o).
		
//		brl.add(null);
//		System.out.println(brl);
//		System.out.println("brl contient null ? "+brl.contains(null));

		//OK
//		brl.add(p3);
//		System.out.println(brl);
//		System.out.println("capacity :"+brl.pointCapacity());
//		System.out.println("nb point :"+brl.nbPoints());
		
//		//KO
//		brl.add(p4);
//		System.out.println(brl);
		
	}




}
