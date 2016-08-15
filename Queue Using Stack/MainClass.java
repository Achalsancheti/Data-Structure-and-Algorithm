/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import Question7.QueueUsingStack;
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
        QueueUsingStack queue = new QueueUsingStack();            
        char ch;         
        do
        {
            System.out.println("\n\033[32;1;2mQueue Operations Using Stack\n");
            System.out.println("\033[31;1m1.\033[0m \033[32;1;2mInsert");
            System.out.println("\033[31;1m2.\033[0m \033[32;1;2mRemove");
            System.out.println("\033[31;1m3.\033[0m \033[32;1;2mPeek");
            System.out.println("\033[31;1m4.\033[0m \033[32;1;2mCheck Empty");
            System.out.println("\033[31;1m5.\033[0m \033[32;1;2mSize\n");            
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("\nEnter integer element to insert");
                queue.insert( scan.nextInt() );                 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("\nRemoved Element = "+ queue.remove() );
                }
                catch (Exception e) 
                {
                    System.out.println("\nError : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("\nPeek Element = "+ queue.peek() );
                }
                catch (Exception e) 
                {
                    System.out.println("\nError : " + e.getMessage());
                }
                break;                          
            case 4 : 
                System.out.println("\nEmpty Status = "+ queue.isEmpty() );
                break;                
            case 5 : 
                System.out.println("\nSize = "+ queue.getSize() );
                break;                          
            default : 
                System.out.println("\nWrong Entry");
                break;    
            }                
            /* Display Queue */        
            queue.display();            
            System.out.println("\nDo You Want To Continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');  
    }
    
}
