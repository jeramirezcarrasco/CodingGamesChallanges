// Difficulty: Easy
// Language: Python
// Time: 1 hours
// Date: 7/18/2020

// You are given a 1-dimensional spreadsheet. You are to resolve the formulae and give the value of all its cells.

// https://www.codingame.com/training/easy/1d-spreadsheet


import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[][] SpreadSheet = new String[N][4];
        boolean[] Finish = new boolean[N];
        for (int i = 0; i < N; i++) {
            SpreadSheet[i][0]  = in.next();
            SpreadSheet[i][1] = in.next();
            SpreadSheet[i][2] = in.next();
        }
        for (int i = 0; i < N; i++) 
        {
            System.out.println(SpreadSheetOperation(SpreadSheet, i));
        }
    }
    public static String SpreadSheetOperation(String[][] SpreadSheet, int index)
    {
        if(SpreadSheet[index][3] == null)
        {
            if(SpreadSheet[index][0].equals("VALUE"))
            {
                SpreadSheet[index][3] = ValueRead(SpreadSheet[index][1], SpreadSheet);
                return SpreadSheet[index][3];
            }
            else if(SpreadSheet[index][0].equals("ADD"))
            {
                SpreadSheet[index][3] = ADD(SpreadSheet[index][1], SpreadSheet[index][2], SpreadSheet);
                return SpreadSheet[index][3];
            }
            else if(SpreadSheet[index][0].equals("SUB"))
            {
                SpreadSheet[index][3] = SUB(SpreadSheet[index][1], SpreadSheet[index][2], SpreadSheet);
                return SpreadSheet[index][3];
            }
            else if(SpreadSheet[index][0].equals("MULT"))
            {
                SpreadSheet[index][3] = MULT(SpreadSheet[index][1], SpreadSheet[index][2], SpreadSheet);
                return SpreadSheet[index][3];
            }
        }
        else
        {
            return SpreadSheet[index][3];
        }
        return "null" ;
    }
    public static String ADD(String Val1, String Val2, String[][] SpreadSheet )
    {
        
        return (String.valueOf(Integer.parseInt(ValueRead(Val1, SpreadSheet)) + Integer.parseInt(ValueRead(Val2, SpreadSheet))));
    }
    public static String SUB(String Val1, String Val2, String[][] SpreadSheet)
    {
        return (String.valueOf(Integer.parseInt(ValueRead(Val1, SpreadSheet)) - Integer.parseInt(ValueRead(Val2, SpreadSheet))));
    }
    public static String MULT(String Val1, String Val2, String[][] SpreadSheet)
    {
        return (String.valueOf(Integer.parseInt(ValueRead(Val1, SpreadSheet)) * Integer.parseInt(ValueRead(Val2, SpreadSheet))));
    }

    public static String ValueRead(String value,String[][] SpreadSheet)
    {
        int size = value.length();
        if(value.substring(0,1).equals("$"))
        {
            return SpreadSheetOperation(SpreadSheet, Integer.parseInt(value.substring(1, size )));
        }
        else
        {
            return value;
        }
    }
}
