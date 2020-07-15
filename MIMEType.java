/**
 * Difficulty:Easy
 * Language:Java
 * Time:2 hours
 * Date:7/14/202
 *
 *You are provided with a table which associates MIME types to file extensions.
 *You are also given a list of names of files to be transferred and for each one of these files, you must find the MIME type to be used.
 **/

import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String[][] FileAndMime = new String[N][2]; 
        for (int i = 0; i < N; i++) {
            FileAndMime[i][0] = in.next();
            FileAndMime[i][1] = in.next();
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String[] FNAME = in.nextLine().split("\\.", -1);
            boolean passed = false;
            if(FNAME.length > 1 && !FNAME[FNAME.length -1].equals(""))
            {
                for (int j = 0; j < FileAndMime.length; j++) 
                {
                    if(FNAME[FNAME.length -1].equalsIgnoreCase(FileAndMime[j][0]) )
                    {
                        System.out.println(FileAndMime[j][1]);
                        passed = true;
                        break;
                    }
                }
                if(!passed)
                    System.out.println("UNKNOWN");
            }
            else
            {
                System.out.println("UNKNOWN");
            }
        }
    }
}
