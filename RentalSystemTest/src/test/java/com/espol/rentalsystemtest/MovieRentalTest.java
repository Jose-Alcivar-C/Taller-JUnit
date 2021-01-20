/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class MovieRentalTest {
    
    public MovieRentalTest() {
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
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        MovieRental instance = new MovieRental(new Movie("El naufrago", Movie.CHILDRENS),0);
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        MovieRental instance = new MovieRental(new Movie("El naufrago", Movie.CHILDRENS),0);;
        Movie expResult = new Movie("El naufrago", Movie.CHILDRENS);
        Movie result = instance.getMovie();
        assertEquals(expResult._title, result._title);
    }
}
