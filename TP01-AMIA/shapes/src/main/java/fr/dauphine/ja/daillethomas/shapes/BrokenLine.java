package fr.dauphine.ja.daillethomas.shapes;

import java.util.ArrayList;

public class BrokenLine {
	
	private int  nbMax;
	private Point[] tab;


	public BrokenLine(int nbMax, Point[] tab) {
		
		if (tab.length > nbMax) {
			throw new IllegalArgumentException("Votre tableau est plus grand que le nombre maximum de point que vous autorisés.");
		}
		
		this.nbMax = nbMax;
		this.tab = new Point[nbMax];
		
		for (int i =0; i < nbMax; i++) {
			this.tab[i]=tab[i];
		}

	}

	public void add (Point p) {
		//TODO
	}

	public static void main(String[] args) {
		

	}

}
