package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("Luis", Movie.CHILDRENS),2);
        Customer instance = new Customer("Luis");
        instance.addMovieRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(arg.getMovie()._title, instance.getName());
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new Ps3Game("Miguel"),4,true);
        Customer instance = new Customer("Miguel");
        instance.addVideoGameRental(arg);
        
        Ps3Game nuevo = (Ps3Game)arg.getVideoGame();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(nuevo.get_gameName(), instance.getName());
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() 
    {
        System.out.println("statement");
        Customer instance = new Customer("Bryan");
        String expResult = instance.statement();
        String result = instance.statement();
        assertEquals(expResult, result);
    }
    
}
