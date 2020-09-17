package fr.dauphine.ja.daillethomas.td00;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    /**
     * test0IsPrime(), testTwoIsPrime() et test9IsNotPrime(),
qui verient respectivement que la fonction isPrime de PrimeCollection fonc-
tionne correctement lorsqu'on l'execute avec l'argument 0, 2 et 9.
     */
    
    public void test0IsPrime()
    {
    	ArrayList<Integer> list = new ArrayList<>();
        PrimeCollection pm1 = new PrimeCollection(list);
        assertTrue(pm1.isPrime(0));
    }
    
    public void testTwoIsPrime()
    {
    	ArrayList<Integer> list = new ArrayList<>();
        PrimeCollection pm1 = new PrimeCollection(list);
        assertTrue(pm1.isPrime(2));
    }
    
    public void test9IsNotPrime()
    {
    	ArrayList<Integer> list = new ArrayList<>();
        PrimeCollection pm1 = new PrimeCollection(list);
        assertFalse(pm1.isPrime(9));
    }
    
    
}
