// Difficulty: Medium 
// Language: Java
// Time: 3 hour
// Date: 7/23/2020

// Given the prize-money for each tournament, and the maximum consecutive days Merry and Pippin can play without break, output the maximum prize money they can win

// https://www.codingame.com/training/medium/the-grand-festival---i

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        int PRIZE[] = new int[N];
        for (int i = 0; i < N; i++) {
            PRIZE[i] = in.nextInt();
        }
        int[][] meoitzation = new int[N][R];
        System.out.println(Math.max(iter(PRIZE, 0, R, R, meoitzation),
                            iter(PRIZE, 1, R, R, meoitzation)));
        for (int i = 0; i < N; i++) 
        {
            System.err.println(Arrays.toString(meoitzation[i]));   
        }
    }
    
    public static int iter(int[] PRIZE, int Index, int R, int C, int meoi[][])
    {
        C --;
        if(Index >= PRIZE.length)
            return 0;
        if(meoi[Index][C ] != 0)
            return meoi[Index][C ];
        if(C > 0)
        {
            
            int max = PRIZE[Index] + Math.max(iter(PRIZE, Index +1, R, C , meoi),
                            iter(PRIZE, Index +2, R, R, meoi));
            meoi[Index][C ] = max;
            return max;
        }
        else
        {
            int max = PRIZE[Index] + Math.max(iter(PRIZE, Index +2, R, R, meoi),
                            iter(PRIZE, Index +3, R, R, meoi));
            meoi[Index][C] = max;
            return max;
        }
         
    }
}







