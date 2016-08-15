/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.NoSuchElementException;

/**
 *
 * @author sanch
 */
public class Stack {
    
    private List top ;
    private int size ;
 

    public Stack()
    {
        top = null;
        size = 0;
    }    

    public boolean isEmpty()
    {
        return top == null;
    }    

    public int getSize()
    {
        return size;
    }    

    public void push(int data)
    {
        List nptr = new List (data, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setList(top);
            top = nptr;
        }
        size++ ;
    }    

    public int pop()
    {
        if (isEmpty() )
        throw new NoSuchElementException("Underflow Exception") ;
        List ptr = top;
        top = ptr.getList();
        size-- ;
        return ptr.getData();
    }    

    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return top.getData();
    }    

    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        List ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getList();
        }
        System.out.println();        
    }
    
}
