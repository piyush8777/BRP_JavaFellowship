package com.bridgelabz.day10.util;

import java.util.Arrays;

public class MathFunction {
    //Method to find Maximum and Minimum String from Array
    public static String MaxString(String[] array)
    {
        //Sorting an array.
        //And Print sort array
        System.out.println("Sorted Array");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Max String==="  +array[array.length-1]);
        System.out.println("Min String==="  +array[0]);
        return "";
    }

    //Method to find max and min from Array
    public static void MaxMinIntArray(int[] array)
    {
        int smalest =array[0];
        int secondsmalest = array[1];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] <smalest)
            {
                secondsmalest = smalest;
                smalest = array[i];
            }
            else if(array[i] < secondsmalest && array[i]!=smalest)
            {
                secondsmalest=array[i];
            }
        }
        System.out.println("2nd smallest value= "+secondsmalest);
        System.out.println("1st smallest value= "+smalest);
    }


public static String Collinear(int x1,int x2,int x3,int y1,int y2,int y3){
    //Calculating the area of triangle and check that 3 points are Colinear or not
    int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
    if (a==0)
        System.out.println("Yes points are Colinear");
    else
        System.out.println("No points are not colinear");
    return "";
}
}
