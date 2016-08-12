/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author sanch
 */
public class LinkedList {
    
    private List start;
    private List end ;
    public int size ;
 
    public LinkedList()
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
        long startTime = System.nanoTime();
        List list = new List(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = list;
            end = start;
        }
        else 
        {
            list.setList(start);
            start = list;
        }
        long endTime = System.nanoTime();
        System.out.println("\nThat took " + (endTime - startTime) + " nanoseconds");
    }
    
    public void head(int val){
        long s = System.nanoTime();
        List list = new List(val, null);
        if(start!=null){
            list=start;
            val = list.getData();
            System.out.println("\nHead Node is: " + val);
        }else{
            System.out.println("\nList Does Not Exist");
        }
        long e = System.nanoTime();
        System.out.println("\nThat took " + (e - s) + " nanoseconds");
    }
    
    public void tail(int val){
        long st = System.nanoTime();
        List list = new List(val, null);
        if(start!=null){
            list=end;
            val = list.getData();
            System.out.println("\nTail Node is: " + val);
        }else{
            System.out.println("\nList Does Not Exist");
        }
        long en = System.nanoTime();
        System.out.println("\nThat took " + (en - st) + " nanoseconds");
    }


    public void insertAtEnd(int val)
    {
        long sta = System.nanoTime();
        List list = new List(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = list;
            end = start;
        }
        else 
        {
            end.setList(list);
            end = list;
        }
        long end = System.nanoTime();
        System.out.println("\nThat took " + (end - sta) + " nanoseconds");
    }

    public void insertAtPos(int val , int pos)
    {
        long startt = System.nanoTime();
        List list = new List(val, null);                
        List ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                List tmp = ptr.getList() ;
                ptr.setList(list);
                list.setList(tmp);
                break;
            }
            ptr = ptr.getList();
        }
        size++ ;
        long endtim = System.nanoTime();
        System.out.println("\nThat took " + (endtim - startt) + " nanoseconds");
    }

    public void deleteAtPos(int pos)
    {        
        long startti = System.nanoTime();
        if (pos == 1) 
        {
            start = start.getList();
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
            end.setList(null);
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
        long endtime = System.nanoTime();
        System.out.println("\nThat took " + (endtime - startti) + " nanoseconds");
    }   
    
    public void reverseLinkedList()
    {
    	System.out.println("\nLinked List Reversed");
    	for(int i = 0; i < size/2; i++)
    	{
    		List reversedPart = null;
    		List current = start;
    		while (current != null) {
    		    List next = current.list;
    		    current.list = reversedPart;
    		    reversedPart = current;
    		    current = next;
    		}
    		start = reversedPart;
    	}
    }

    public void display()
    {
        System.out.print("\nLinked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getList() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        List ptr = start;
        System.out.print(start.getData()+ "->");
        ptr = start.getList();
        while (ptr.getList() != null)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getList();
        }
        System.out.print(ptr.getData()+ "\n");
    }
    
}
