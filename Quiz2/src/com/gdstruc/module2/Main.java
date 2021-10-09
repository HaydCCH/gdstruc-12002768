package com.gdstruc.module2;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
	// write your code here

        linklist kirito =(new linklist(1,"Kirito", 100 ));
        linklist asuna =(new linklist(2,"Asuna", 69 ));
        linklist klien =(new linklist(3,"Klein", 59 ));
        linklist leafa =(new linklist(4,"Leafa", 60 ));
        LINKEDLIST newlinkedlist = new LINKEDLIST();
        newlinkedlist.addtoFront(kirito);
        newlinkedlist.addtoFront(asuna);
        newlinkedlist.addtoFront(klien);
        newlinkedlist.addtoFront(leafa);
        newlinkedlist.printList();
System.out.println("There are ");
newlinkedlist.count();
System.out.println("Contain");
        System.out.println(newlinkedlist.contains(kirito,1,"Kirito",100));
        System.out.println();
        System.out.println("Index Search ");
        System.out.println(newlinkedlist.indexof(asuna,2,"Asuna",69));
        newlinkedlist.deleteFront();
        System.out.println();
        System.out.println("Removed front!:");
        newlinkedlist.printList();

    }
}
