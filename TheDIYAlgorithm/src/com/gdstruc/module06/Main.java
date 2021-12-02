package com.gdstruc.module06;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("how much do you want in your array");
        n = in.nextInt();

        array = new int[n];
        System.out.println("Enter those " + n + " numbers");
        for (c = 0; c <n; c++)
        {



            array[c] = in.nextInt();


        }

        System.out.println("Enter value to find");
        search = in.nextInt();
        for (c = 0; c <n; c++)
        {
            if (array[c] == search)
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }

        }
        if (c == n)
            System.out.println(search + " isn't present in array.");
    }
}
