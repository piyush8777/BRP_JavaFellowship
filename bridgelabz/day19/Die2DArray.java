/**
 * **************************************************************************************
 * Purpose:Code to Roll n times and store the result in a 2D array and show exactly the 
 * time the number was repeated.
 * 
 * @author Piyush Shaw
 * @version 1.0
 * @since 16-09-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day19;

import java.util.Scanner;

public class Die2DArray {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many times you want to roll the die: "); 
        int x = scan.nextInt();
        System.out.print("Enter the amount of sides: ");
        int y = scan.nextInt();          
        System.out.print("Enter the amount of die: ");
        int z = scan.nextInt();      
        int[][] dice = new int[x][z];
        int row = 0;
        for (int i = 0; i<z; ++i){
             dice[row][i] += ((int)(Math.random()*y)+1);
             if ((i == z-1)&&(row!=x)) {
                i = 0;
                ++row;
             }
        }     
        row = 0;
        int[] sum = new int[x];
        for (int j = 0; j<z; ++j){
            sum[row]+=dice[j][row];
            if ((j == z-1)&&(row!=x)) {
                j = 0;
                ++row;          
            }
        }                                                                                                                                                                                           
        int[] counter = new int[2*y];
        int k = 0;
        while (k<sum.length){
            for (int l = 0;l<((2*y)-1);++l){
                if (sum[k]==l) ++counter[l];
                if (l==((2*y)-1)) {
                    ++k;
                }
            }
        }   
        for (int m = 0;m<sum.length;++m) System.out.println(sum[m]+"'s: "+counter[m]+"times, "+((((double)counter[m])/x)*100)+"%");                                                   
    }

}
