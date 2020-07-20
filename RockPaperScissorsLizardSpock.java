// Difficulty: Easy
// Language: Java
// Time: 1 hour
// Date: 7/19/2020

// An international Rock Paper Scissors Lizard Spock tournament is organized, all players receive a number when they register.
// Line 1: the number of the winner
// Line 2: the list of its opponents separated by spaces

// https://www.codingame.com/training/easy/rock-paper-scissors-lizard-spock

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<ArrayList<Object>> PlayerS = new ArrayList<ArrayList<Object>>();
        for (int i = 0; i < N; i++) {
            ArrayList<Object> Player = new ArrayList<Object>();
            Player.add(in.nextInt());
            Player.add(in.next());
            PlayerS.add(Player);
        }

        while(PlayerS.size() > 1)
        {
            for (int i = 0; i < PlayerS.size() ; i ++) 
            {
                String P1 = PlayerS.get(i).get(1).toString();
                int P1N = (int)PlayerS.get(i).get(0);
                String P2 = PlayerS.get(i+1).get(1).toString();
                int P2N = (int)PlayerS.get(i+1).get(0);
                if(P1.equals("R"))
                {
                    if(P2.equals("P"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("C"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("L"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("S"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else
                    {
                        if(P1N < P2N)
                        {
                            PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                            PlayerS.remove(i+1);
                        }
                        else
                        {
                            PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                            PlayerS.remove(i);
                        }
                    }
                }
//----------------------------------------------
                else if(P1.equals("P"))
                {
                    if(P2.equals("R"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("C"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("L"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("S"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else
                    {
                        if(P1N < P2N)
                        {
                            PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                            PlayerS.remove(i+1);
                        }
                        else
                        {
                            PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                            PlayerS.remove(i);
                        }
                    }
                }
//-----------------------------------------------------
                else if(P1.equals("C"))
                {
                    if(P2.equals("P"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("R"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("L"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("S"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else
                    {
                        if(P1N < P2N)
                        {
                            PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                            PlayerS.remove(i+1);
                        }
                        else
                        {
                            PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                            PlayerS.remove(i);
                        }
                    }
                }
//-----------------------------------------------------
                else if(P1.equals("L"))
                {
                    if(P2.equals("P"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("R"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("C"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("S"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else
                    {
                        if(P1N < P2N)
                        {
                            PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                            PlayerS.remove(i+1);
                        }
                        else
                        {
                            PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                            PlayerS.remove(i);
                        }
                    }
                }
//-----------------------------------------------------
                else if(P1.equals("S"))
                {
                    if(P2.equals("P"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else if(P2.equals("R"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("C"))
                    {
                        PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                        PlayerS.remove(i+1);
                    }
                    else if(P2.equals("L"))
                    {
                        PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                        PlayerS.remove(i);
                    }
                    else
                    {
                        if(P1N < P2N)
                        {
                            PlayerS.get(i).add(PlayerS.get(i+1).get(0));
                            PlayerS.remove(i+1);
                        }
                        else
                        {
                            PlayerS.get(i+1).add(PlayerS.get(i).get(0));
                            PlayerS.remove(i);
                        }
                    }
                }
            }
        }

        System.out.println(PlayerS.get(0).get(0));
        for (int j = 2; j < PlayerS.get(0).size() -1; j++) 
        {
            System.out.print(PlayerS.get(0).get(j) +" ");
        }
        System.out.print(PlayerS.get(0).get(PlayerS.get(0).size()-1));
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
    }
}
