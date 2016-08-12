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
public class List {
    
    public int data;
    public List list;
 
    public List()
    {
        list = null;
        data = 0;
    }    

    public List(int d,List n)
    {
        data = d;
        list = n;
    }    

    public void setList(List n)
    {
        list = n;
    }    

    public void setData(int d)
    {
        data = d;
    }    

    public List getList()
    {
        return list;
    }    

    public int getData()
    {
        return data;
    }
    
    
}
