/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import Question2.Stack;
import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);   

        Stack ls = new Stack();          
        char ch;     
        do 
        {
            System.out.println("\n\033[32;1;2mStack Operations\n");
            System.out.println("\033[31;1m1.\033[0m \033[32;1;2mPush");
            System.out.println("\033[31;1m2.\033[0m \033[32;1;2mPop");
            System.out.println("\033[31;1m3.\033[0m \033[32;1;2mPeek");
            System.out.println("\033[31;1m4.\033[0m \033[32;1;2mCheck Empty");
            System.out.println("\033[31;1m5.\033[0m \033[32;1;2mSize\n");            
            int choice = scan.nextInt();
            switch (choice) 
            {
            case 1 :
                System.out.println("\nEnter Integer Element To Push");
                ls.push( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("\nPopped Element = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("\nPeek Element = "+ ls.peek());
                }
                catch (Exception e)
                {
                    System.out.println("\nError : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("\nEmpty Status = "+ ls.isEmpty());
                break;                
            case 5 : 
                System.out.println("\nSize = "+ ls.getSize()); 
                break;                                       
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           

            ls.display();            
            System.out.println("\nDo You Want To Continue (Type y or n) \n");
            ch = scan.next().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');          
    }
    
}
