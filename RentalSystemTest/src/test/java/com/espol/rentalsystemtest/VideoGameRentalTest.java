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
public class VideoGameRentalTest {
    
    public VideoGameRentalTest() {
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
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Ps3Game juego = new Ps3Game("Halo");
        VideoGameRental instance = new VideoGameRental(juego,0,true);
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        Ps3Game juego = new Ps3Game("COD");
        VideoGameRental instance = new VideoGameRental(juego,0,true);;
        Object expResult = juego;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        Ps3Game juego = new Ps3Game("gtaV");
        VideoGameRental instance = new VideoGameRental(juego,5,true);
        double expResult = juego.getCharge(5, true);
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        Ps3Game juego = new Ps3Game("Pes 2016");
        VideoGameRental instance = new VideoGameRental(juego,2,true);
        int expResult = juego.getFrequentRenterPoints(2, true);
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }
    
}
