package com.gdstruc.module7;

public class node {
    private int data;
    private node rightchild;
    private node leftchild;

    public void insert(int value)
    {
        if (value == data)
        {
            return;
        }
        if (value < data)
        {
            if (leftchild == null)
            {
                leftchild = new node(value);
            }else
            {
                leftchild.insert(value);
            }
        }
        else
        {
            if (rightchild == null)
            {
                rightchild = new node(value);
            }
            else
            {
                rightchild.insert(value);
            }
        }

    }
    public void traverseinorder()
    {
        if (leftchild != null)
        {
            leftchild.traverseinorder();
        }
        System.out.println("Data: " + data);
        if (rightchild != null)
        {
            rightchild.traverseinorder();
        }
    }
    public  void  traverseinreverse()
    {
        if (rightchild != null)
        {
            rightchild.traverseinreverse();
        }
        System.out.println("Data: " + data);
        if (leftchild != null)
        {
            leftchild.traverseinreverse();
        }
    }
    public node getMin()
    {

        while (leftchild != null)
        {
            return (leftchild.getMin());
        }
        return this;
    }
   public node getMax()
    {
        /* loop down to find the rightmost leaf */

        while (rightchild != null)
        {
            return rightchild.getMax();
        }
       return this;
    }
    public node get(int value)
    {
        if (value== data)
        {
            return this;
        }
            if (value < data)
            {
            if (leftchild != null)
            {
                return leftchild.get(value);
            }
        }else
        {
         if (rightchild != null)
         {
             return rightchild.get(value);
         }
        }
        return null;
    }
    public node(int _data)
    {
        this.data =_data;

    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getRightchild() {
        return rightchild;
    }

    public void setRightchild(node rightchild) {
        this.rightchild = rightchild;
    }

    public node getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(node leftchild) {
        this.leftchild = leftchild;
    }

    @Override
    public String toString() {
        return "node{" +
                "data=" + data +
                '}';
    }
}
