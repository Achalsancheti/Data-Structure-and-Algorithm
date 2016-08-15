package Question4;

import Question4.List;

 public class DoubleLinkedList {
/**
*
* @author sanch
*/
   
     protected List start;
    protected List end ;
    public int size;
    /* Constructor */
    public DoubleLinkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at begining */
    public void insertAtStart(int val)
    {
        List nptr = new List(val, null, null);       
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setListPrev(nptr);
            nptr.setListNext(start);
            start = nptr;
        }
        size++;
    }
    /* Function to insert element at end */
    public void insertAtEnd(int val)
    {
        List nptr = new List(val, null, null);       
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setListPrev(end);
            end.setListNext(nptr);
            end = nptr;
        }
        size++;
    }
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos)
    {
        List nptr = new List(val, null, null);   
        if (pos == 1)
        {
            insertAtStart(val);
            return;
        }           
        List ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                List tmp = ptr.getListNext();
                ptr.setListNext(nptr);
                nptr.setListPrev(ptr);
                nptr.setListNext(tmp);
                tmp.setListPrev(nptr);
            }
            ptr = ptr.getListNext();           
        }
        size++ ;
    }
    /* Function to delete node at position */
    public void deleteAtPos(int pos)
    {        
        if (pos == 1)
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return;
            }
            start = start.getListNext();
            start.setListPrev(null);
            size--;
            return ;
        }
        if (pos == size)
        {
            end = end.getListPrev();
            end.setListNext(null);
            size-- ;
        }
        List ptr = start.getListNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                List p = ptr.getListPrev();
                List n = ptr.getListNext();
                p.setListNext(n);
                n.setListPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getListNext();
        }       
    }   
    /* Function to display status of list */
    public void display()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getListNext()== null)
        {
            System.out.println(start.getData() );
            return;
        }
        List ptr = start;
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getListNext();
        while (ptr.getListNext()!= null)
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getListNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
   
    public void getHeadNode(int val) {
 
        List nodeHead = new List();
 
        if (start != null) {
            nodeHead = start;
 
            val = nodeHead.getData();
            System.out.println(val);
        } else {
            System.out.println("List donot exist");
        }
 
    }
 
    public void getTailnode(int val) {
 
        List nodeTail = new List();
 
        if (start != null) {
            nodeTail = end;
 
            val = nodeTail.getData();
            System.out.println(val);
        } else {
            System.out.println("List donot exist");
        }
 
    }
   
     
   }
 
