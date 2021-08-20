/**
 * **************************************************************************************
 * Purpose:Write a program DayOfWeek.java that takes a date as input and prints the day of
 *  the week that date falls on. Your program should take three command-line
 *  arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for
 *  February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday,
 *  and so forth. Use the following formulas, for the Gregorian calendar (where / denotes
 *  integer division):
 *  y 0 = y − (14 − m ) / 12
 *  x = y 0 + y 0 /4 − y 0 /100 + y 0 /400
 *  m 0 = m + 12 × ((14 − m ) / 12) − 2
 *  d 0 = ( d + x + 31 m 0 / 12) mod 7
 *                       
 * @author Piyush Shaw
 * @version 1.0
 * @since 16-08-2021
 * ***************************************************************************************
 */

package com.bridgelabz.day3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayofWeek {
	static int method(int year , int month , int day){
        //to check the validity of day of month
        int [] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31  };
        //check validity of year and month
        if (year > 0 && (month > 0 && month <=12)){
            // check for a leap year and month of February.
            if ((year % 4 == 0 || year % 400 == 0) &&
                    month == 2 && (day >0 && day <=29)){
                // month starts at zero, so we need to put ( month - 1 ).
                Calendar calendar = new GregorianCalendar(year, month-1 ,day);
                return calendar.get(Calendar.DAY_OF_WEEK);
            }
            else{
                //check the range of the month
                if (day > 0 && day <= darr[month - 1]){
                    //month start at zero ,so we need to put (month-1)
                    Calendar calendar = new GregorianCalendar(year,month - 1,day);
                    return calendar.get(Calendar.DAY_OF_WEEK);
                }
                else
                    return 0;
            }
        }
        else
            return  0;    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] dayofweek = { " Invalid","Sun","Mon","Tue","Wed","Thur","Fri","Sat" };
        int y,m,d;
        //Taking input from the user
        System.out.println("Enter Year: ");
        y=sc.nextInt();
        System.out.println("Enter Month: ");
        m=sc.nextInt();
        System.out.println("Enter Day: ");
        d=sc.nextInt();
        System.out.println("Day Of Week is : "+dayofweek[method(y,m,d)]);
    }

}
