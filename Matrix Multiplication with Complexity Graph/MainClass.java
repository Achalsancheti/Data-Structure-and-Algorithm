/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;

/**
 *
 * @author sanch
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix ma = new Matrix();
        ma.matA();
        ma.matB();
        
        long startTime = System.nanoTime();
        ma.addition();
        long endTime = System.nanoTime();
        System.out.println("\nThat took " + (endTime - startTime)/1000000 + " milliseconds");
        
        
        long start = System.nanoTime();
        ma.subtraction();
        long end = System.nanoTime();
        System.out.println("\nThat took " + (end - start)/1000000 + " milliseconds");
        
        
        long sT = System.nanoTime();
        ma.multiplication();
        long eT = System.nanoTime();
        System.out.println("\nThat took " + (eT - sT)/1000000 + " milliseconds");
        
        MainFrame gjp = new MainFrame();
        gjp.setVisible(true);
        gjp.setLocation(600,250);
        gjp.setSize(550, 400);

    }
    
}
