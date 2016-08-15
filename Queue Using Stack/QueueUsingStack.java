/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import Question2.Stack;
import java.util.NoSuchElementException;



/**
 *
 * @author sanch
 */
public class QueueUsingStack {
    
    Stack stack ;
    Stack tmp ;
 
    public QueueUsingStack()
    {
        stack = new Stack();
        tmp = new Stack();
    }

    public void insert(int data)
    {      
        if (stack.getSize()== 0)
            stack.push(data);
        else
        {         
            int l = stack.getSize();
            for (int i = 0; i < l; i++)
                tmp.push(stack.pop());
            stack.push(data);            
         
            for (int i = 0; i < l; i++)
                stack.push(tmp.pop());                   
        }
    }    
    
    public int remove()
    {
        if (stack.getSize() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return stack.pop();
    }    

    public int peek()
    {
        if (stack.getSize() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return stack.peek();
    }        

    public boolean isEmpty()
    {
        return stack.getSize() == 0 ;
    }    

    public int getSize()
    {
        return stack.getSize();
    }    

    public void display()
    {
        stack.display();
    }
    
}
