package com.gdstruc.module6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String members[] = {"Intro","Begginger","Medium", "Hard"};
        System.out.println(linearsearch(members, "Medium"));
        System.out.println(linearsearch(members, "Expert"));
    }
    public static int linearsearch(String[] input, String value)
    {
        for (int i =0; i< input.length; i++ )
        {
           if (input[i] == value)
           {
               return i;
           }

        }
        return -1;
    }
    public static int binarysearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length -1;
        while (start <= end)
        {
            int middle = (start + end) /2;
if (input[middle] == value)
{
    return middle;

}else if (value < input[middle])
{
end = middle -1;
}
else if ( value > input[middle])
{
start = middle +1;
}

        }
        return  -1;
    }
}
