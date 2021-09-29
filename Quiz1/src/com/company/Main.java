package com.company;


public class Main {

    public static void main(String[] args) {


        int intArray[] = new int[]{123,90,35,45,150,3};


        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }


        bubbleSort(intArray);



        System.out.println("");


        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        selectionsortdecend(intArray);
        System.out.println("Array After Selection Sort Decending");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        selectionsortascend(intArray);
        System.out.println("Array After Selection Sort Ascending");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

    }

    private static void bubbleSort(int[] intArray) {



        int n = intArray.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intArray[j-1] < intArray[j]){
                    //swap the elements!
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

    }

    private static void selectionsortdecend(int [] intArray)
    {

        {
            int n = intArray.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i > n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                int temp = intArray[min_idx];
                intArray[min_idx] = intArray[i];
                intArray[i] = temp;

                for (int j = i+1; j < n; j++)
                    if (intArray[j] < intArray[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element

            }
        }

    }
    private static void selectionsortascend(int [] intArray)
    {
        int n = intArray.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (intArray[j] < intArray[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = intArray[min_idx];
            intArray[min_idx] = intArray[i];
            intArray[i] = temp;
        }
    }
}