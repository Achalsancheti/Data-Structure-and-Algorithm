/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import Question8.CircularLinkedList;
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
        
        CircularLinkedList list = new CircularLinkedList();         
        char ch;
        do
        {
            System.out.println("\n\033[32;1;2mCircular Singly Linked List Operations\n");
            System.out.println("\033[31;1m1.\033[0m \033[32;1;2mInsert At Begining");
            System.out.println("\033[31;1m2.\033[0m \033[32;1;2mInsert At End");
            System.out.println("\033[31;1m3.\033[0m \033[32;1;2mInsert At Position");
            System.out.println("\033[31;1m4.\033[0m \033[32;1;2mDelete At Position");
            System.out.println("\033[31;1m5.\033[0m \033[32;1;2mCheck Empty");
            System.out.println("\033[31;1m6.\033[0m \033[32;1;2mGet Size\n");            
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
                    System.out.println("Invalid Position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("\nEnter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("\nInvalid position\n");
                else
                    list.deleteAtPos(p);
                break;
            case 5 : 
                System.out.println("\nEmpty status = "+ list.isEmpty());
                break;                   
            case 6 : 
                System.out.println("\nSize = "+ list.getSize() +" \n");
                break;                         
             default : 
                System.out.println("\nWrong Entry ");
                break;   
            }
            list.display();
            System.out.println("\nDo You Want To Continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                    
    }
    
}
