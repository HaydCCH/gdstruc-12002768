package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {
	// write your code here
        tree Tree = new tree();
        Tree.insert(12);
        Tree.insert(133);
        Tree.insert(123);
        Tree.insert(312);
        Tree.insert(3123);
        Tree.insert(112);
        Tree.insert(67);
        Tree.traverseinorder();
System.out.println("Here is the reverse : ");
        Tree.traverseinreverse();
        System.out.println("Here is the min number : ");
        System.out.println(Tree.getMin());
        System.out.println("Here is the max number : ");
        System.out.println(Tree.getMax());

    }
}
