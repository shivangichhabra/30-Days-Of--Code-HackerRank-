/*
Objective
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input
2
Hacker
Rank

Sample Output
Hce akr
Rn ak
 */

import java.util.Scanner;

public class Day6 {
    public static void printOutput(String s)
    {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(i%2 == 0)
                even.append(s.charAt(i));
            else
                odd.append(s.charAt(i));
        }

        System.out.println(even+" "+odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //no of strings
        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            printOutput(s);
        }
    }
}