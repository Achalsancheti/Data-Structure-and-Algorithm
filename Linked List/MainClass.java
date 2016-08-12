/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import Question1.LinkedList;
import Question1.List;
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
        
        LinkedList list = new LinkedList();  
        List link = new List();
        char ch;
        do
        {
            System.out.println("\n\033[32;1;2mLinked List Operations\n");
            System.out.println("\033[31;1m1.\033[0m \033[32;1;2mInsert At Begining");
            System.out.println("\033[31;1m2.\033[0m \033[32;1;2mInsert At End");
            System.out.println("\033[31;1m3.\033[0m \033[32;1;2mInsert At Position");
            System.out.println("\033[31;1m4.\033[0m \033[32;1;2mDelete At Position");
            System.out.println("\033[31;1m5.\033[0m \033[32;1;2mCheck Empty");
            System.out.println("\033[31;1m6.\033[0m \033[32;1;2mGet Size");
            System.out.println("\033[31;1m7.\033[0m \033[32;1;2mGet Head Node");
            System.out.println("\033[31;1m8.\033[0m \033[32;1;2mGet Tail Node");
            System.out.println("\033[31;1m9.\033[0m \033[32;1;2mReverse Linked LIst\n");
            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("\nEnter Integer Element To Insert");
                list.insertAtStart( scan.nextInt() );  
                break;                          
            case 2 : 
                System.out.println("\nEnter Integer Element To Insert");
                list.insertAtEnd( scan.nextInt() );  
                break;                         
            case 3 : 
                System.out.println("\nEnter Integer Element To Insert");
                int num = scan.nextInt() ;
                System.out.println("\nEnter Position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("\nInvalid Position\n");
                    
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("\nEnter Position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid Position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5 : 
                long star = System.nanoTime();
                System.out.println("\nEmpty Status = "+ list.isEmpty());
                long endt = System.nanoTime();
                System.out.println("\nThat took " + (endt - star) + " nanoseconds");
                break;                   
            case 6 : 
                long start = System.nanoTime();
                System.out.println("\nSize = "+ list.getSize());
                long endti = System.nanoTime();
                System.out.println("\nThat took " + (endti - start) + " nanoseconds");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
             case 7 :
                 list.head(0);
                 break;
             case 8 :
                 list.tail(0);
                 break;
             case 9 :
                list.reverseLinkedList();
                break;
            }
            

            list.display();
            System.out.println("\nDo You Want To Continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
    }
    
}
