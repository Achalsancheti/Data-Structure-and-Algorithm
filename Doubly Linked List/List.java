/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author sanch
 */
public class List {
    
    protected int data;
    protected List next, prev;
 

    public List()
    {
        next = null;
        prev = null;
        data = 0;
    }

    public List(int d, List n, List p)
    {
        data = d;
        next = n;
        prev = p;
    }

    public void setListNext(List n)
    {
        next = n;
    }

    public void setListPrev(List p)
    {
        prev = p;
    }    

    public List getListNext()
    {
        return next;
    }

    public List getListPrev()
    {
        return prev;
    }

    public void setData(int d)
    {
        data = d;
    }

    public int getData()
    {
        return data;
    }
    
}
