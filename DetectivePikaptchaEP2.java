// Difficulty: Easy 
// Language: Java
// Time: 2 hour
// Date: 8/5/2020

// Your objective is to write a program that will compute, for each cell of a maze, the number of times Pikaptcha will step into the cell by following a wall until he reaches his original location.

// https://www.codingame.com/training/easy/detective-pikaptcha-ep2

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        int startX = 0;
        int startY = 0;
        String startSide = "";
        String[][] map = new String[height][width];
        for (int i = 0; i < height; i++) {
            map[i] = in.next().split("");
            for (int j = 0; j < map[i].length; j++) 
            {
                if(!map[i][j].equals("0") && !map[i][j].equals("#"))
                {
                    startSide = map[i][j];
                    startX = j;
                    startY = i;
                }
            }
        }
        String side = in.next();
        System.err.println(side);
        if(side.equals("R"))
        {
            Right(map, startY, startX, startSide);
        }
        else
        {
            Left(map, startY, startX, startSide);
        }
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                System.out.print(map[i][j]);
            }
            System.out.println("");
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
         
    }

    public static void Right(String[][] map, int startY, int startX, String startSide)
    {
        int currX = startX;
        int currY = startY;
        String currSide = startSide;
        map[startY][startX] = "0";
        do
        {
            if(currSide.equals(">"))
            {
                if(currY == map.length-1 || map[currY+1][currX].equals("#"))
                {
                    if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    } 
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    } 
                }
                else // v
                {
                    currY++;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "v";
                }
            }
            else if(currSide.equals("^"))
            {
                if(currX == map[0].length-1 || map[currY][currX+1].equals("#"))
                {
                    if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    } 
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                }
                else // >
                {
                    currX++;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = ">";
                }
            }
            else if(currSide.equals("<"))
            {
                if(currY == 0 || map[currY-1][currX].equals("#"))
                {
                    if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    } 
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    }

                }
                else // ^
                {
                    currY--;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "^";
                }
            }
            else // v
            {
                if(currX == 0 || map[currY][currX-1].equals("#"))
                {
                    if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    }
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }

                }
                else // <
                {
                    currX--;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "<";
                }
            }

        }while(currX != startX || currY != startY);
    }

    public static void Left(String[][] map, int startY, int startX, String startSide)
    {
        int currX = startX;
        int currY = startY;
        String currSide = startSide;
        map[startY][startX] = "0";
        do
        {
            if(currSide.equals(">"))
            {
                if(currY == 0 || map[currY-1][currX].equals("#"))
                {
                    if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    }
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    }
                }
                else
                {
                    currY--;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "^";
                }
            }
            else if(currSide.equals("^"))
            {
                if(currX == 0 || map[currY][currX-1].equals("#"))
                {
                    if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    }
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }
                }
                else
                {
                    currX--;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "<";
                }
            }
            else if(currSide.equals("<"))
            {
                if(currY == map.length-1 || map[currY+1][currX].equals("#"))
                {
                    if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    }
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                    else if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "v";
                    }
                }
                else
                {
                    currY++;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = "v";
                }
            }
            else // v
            {
                if(currX == map[0].length-1 || map[currY][currX+1].equals("#"))
                {
                    if(currY < map.length - 1 && !map[currY+1][currX].equals("#")) // v
                    {
                        currY++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    }
                    else if(currX > 0 && !map[currY][currX-1].equals("#")) //<
                    {
                        currX--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "<";
                    }
                    else if(currY > 0 && !map[currY-1][currX].equals("#")) // ^
                    {
                        currY--;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = "^";
                    }
                    else if(currX < map[0].length - 1 && !map[currY][currX+1].equals("#"))// >
                    {
                        currX++;
                        map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                        currSide = ">";
                    }
                }
                else
                {
                    currX++;
                    map[currY][currX] = Integer.toString(Integer.parseInt(map[currY][currX]) + 1);
                    currSide = ">";
                }
            }
        
        }while(currX != startX || currY != startY);

    }
}
