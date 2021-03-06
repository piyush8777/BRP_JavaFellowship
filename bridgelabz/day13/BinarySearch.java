/**
 * **************************************************************************************
 * Purpose:Code to to Binary Search the Word from Word List
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 28-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day13;

import java.util.Arrays;

import com.bridgelabz.day11.StdOut;
import com.bridgelabz.day12.StdIn;
import com.sun.tools.javac.Main;

public class BinarySearch {
	public static int search(String key, String[] a) {
        return search(key, a, 0, a.length);
    }
    public static int search(String key, String[] a, int lo, int hi) {
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else              return mid;
    }

    public static void main(String[] args) {
        Object in = new Main();
        String s = ((StdIn) in).readAll();
        String[] words = s.split("\\s+");
        System.err.println("Done reading words");

        Arrays.sort(words);
        System.err.println("Done sorting words");

        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (search(key, words) < 0) StdOut.println(key);
        }
    }

}
