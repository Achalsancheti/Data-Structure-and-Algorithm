/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author sanch
 */
public class CircularLinkedList {
    
    protected List start ;
    protected List end ;
    public int size ;
 
    public CircularLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public int getSize()
    {
        return size;
    }

    public void insertAtStart(int val)
    {
        List nptr = new List(val,null);    
        nptr.setList(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setList(start);
            end = start;            
        }
        else
        {
            end.setList(nptr);
            start = nptr;        
        }
        size++ ;
    }

    public void insertAtEnd(int val)
    {
        List nptr = new List(val,null);    
        nptr.setList(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setList(start);
            end = start;            
        }
        else
        {
            end.setList(nptr);
            end = nptr;            
        }
        size++ ;
    }

    public void insertAtPos(int val , int pos) 
    {
        List nptr = new List(val,null);                
        List ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                List tmp = ptr.getList() ;
                ptr.setList( nptr );
                nptr.setList(tmp);
                break;
            }
            ptr = ptr.getList();
        }
        size++ ;
    }

    public void deleteAtPos(int pos)
    {    
        if (size == 1 && pos == 1)
        {
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (pos == 1) 
        {
            start = start.getList();
            end.setList(start);
            size--; 
            return ;
        }
        if (pos == size) 
        {
            List s = start;
            List t = start;
            while (s != end)
            {
                t = s;
                s = s.getList();
            }
            end = t;
            end.setList(start);
            size --;
            return;
        }
        List ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                List tmp = ptr.getList();
                tmp = tmp.getList();
                ptr.setList(tmp);
                break;
            }
            ptr = ptr.getList();
        }
        size-- ;
    }

    public void display()
    {
        System.out.print("\nCircular Singly Linked List = ");
        List ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getList() == start) 
        {
            System.out.print(start.getData()+ "->"+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "->");
        ptr = start.getList();
        while (ptr.getList() != start) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getList();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getList();
        System.out.print(ptr.getData()+ "\n");
    }
    
}
