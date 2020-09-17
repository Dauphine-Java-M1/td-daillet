package fr.dauphine.ja.daillethomas.td00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}

	public PrimeCollection(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	
	/**
	 * insere dans la collection numbers, n entiers tires aleatoirement entre 0 et m.
	 * @param n entier à inserer
	 * @param m borne supérieur pour le random
	 */
	public void initRandom(int n, int m) {		     
		for(int i = 0; i < n; i++) {
			numbers.add((int) (Math.random()*m));
		}
	}
	
	/**
	 * 
	 * @param p
	 * @return true si le nombre est premier
	 */
	public boolean isPrime(int p) {
		for(int i = 2; i <= Math.sqrt(p); i++) {
			if((p%i) == 0) {
				return false;
			}
		}
		return true;		
	}
	
	/**
	 * affiche les nombres premiers de numbers
	 */
	public void printPrimes() {
		for(int i = 0; i < numbers.size(); i++) {
			if(isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i) + " est premier !");
			}
		}
	}

    public static void main( String[] args )
    {       
        ArrayList<Integer> list = new ArrayList<>();
        PrimeCollection pm1 = new PrimeCollection(list);
        pm1.initRandom(100, 1000);
        System.out.println("Notre liste "+pm1.getNumbers());
        pm1.printPrimes();
    }
}
