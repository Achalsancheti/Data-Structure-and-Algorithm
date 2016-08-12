/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.NoSuchElementException;

/**
 *
 * @author sanch
 */
public class Queue {
    
    private List front, rear;
    public int size;
 
    public Queue()
    {
        front = null;
        rear = null;
        size = 0;
    }    

    public boolean isEmpty()
    {
        return front == null;
    }    

    public int getSize()
    {
        return size;
    }    

    public void enqueue(int data)
    {
        List nptr = new List(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setList(nptr);
            rear = rear.getList();
        }
        size++ ;
    }    

    public int dequeue()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        List ptr = front;
        front = ptr.getList();        
        if (front == null)
            rear = null;
        size-- ;        
        return ptr.getData();
    }    

    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("\nUnderflow Exception");
        return front.getData();
    }    

    public void display()
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        List ptr = front;
        while (ptr != rear.getList() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getList();
        }
        System.out.println();        
    }
    
}
