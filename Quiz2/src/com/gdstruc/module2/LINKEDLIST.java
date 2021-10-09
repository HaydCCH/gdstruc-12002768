package com.gdstruc.module2;

public class LINKEDLIST {
    private node head;

    public void addtoFront(linklist player) {
        node newNode = new node(player);
        newNode.setNextplayer(head);
        head = newNode;
    }

    public void printList() {
        node current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print("->");
            current = current.getNextplayer();
        }
        System.out.println("null");
    }

    public void deleteFront() {
        node current = head;
        node temp;
        temp = current;
        head = current.getNextplayer();
        current.setPlayer(null);
    }

    public void count() {
        int counter = 0;
        node current = head;
        while (current != null) {
            current = current.getNextplayer();
            counter++;
        }
        System.out.println("List Size: " + counter);
    }

    public boolean contains(linklist player, int id, String name, int level) {
        node current = head;
        while (current != null) {
            current = current.getNextplayer();
            if (player.getId() == id && player.getName() == name && player.getLevel() == level) {
                return true;
            }
        }
        return false;
    }

    public int indexof(linklist player, int id, String name, int level) {
        node current = head;
        int count = 0;
        while (current != null) {
            current = current.getNextplayer();
            if (player.getId() == id && player.getName() == name && player.getLevel() == level) {
                return count;
            }
            count++;
        }
        return -1;
    }
}
