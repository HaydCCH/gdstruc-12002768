package com.gdstruc.module7;

public class tree {
    private node root;
public void insert(int value)
{
    if (root == null)
    {
        root = new node(value);
    }
    else
    {
        root.insert(value);
    }
}
public void traverseinorder()
{
    if (root != null)
    {
        root.traverseinorder();
    }
}
public void traverseinreverse()
{
    if (root != null)
    {
        root.traverseinreverse();
    }
}
public node  getMax()
{ if (root != null)
{
    root.getMax();
}
return root.getMax();
}
    public node getMin()
    {
        if (root == null) {
            root.getMin();
        }
        return root.getMin();
    }
}
