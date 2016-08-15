/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import Question3.Queue;
import java.util.NoSuchElementException;



/**
 *
 * @author sanch
 */
public class StackUsingQueue {
    
    Queue queue ;
    Queue tmp ;
 
    public StackUsingQueue()
    {
        queue = new Queue();
        tmp = new Queue();
    }    

    public void push(int data)
    {
     
        if (queue.getSize()== 0)
            queue.enqueue(data);
        else
        {         
            int l = queue.getSize();
            for (int i = 0; i < l; i++)
                tmp.enqueue(queue.dequeue());                
                queue.enqueue(data);        
            
            for (int i = 0; i < l; i++)
                queue.enqueue(tmp.dequeue());
        }
    }    

    public int pop()
    {
        if (queue.getSize()== 0)
            throw new NoSuchElementException("Underflow Exception");        
        return queue.dequeue();
    }    

    public int peek()
    {
        if (queue.getSize()== 0)
            throw new NoSuchElementException("Underflow Exception");            
        return queue.peek();
    }        

    public boolean isEmpty()
    {
        return queue.getSize()== 0 ;
    }

    public int getSize()
    {
        return queue.getSize();
    }    

    public void display()
    {
       queue.display();
        
    }
    
}
