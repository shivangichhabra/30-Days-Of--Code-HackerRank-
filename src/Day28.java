/*
Objective
Today, we're working with regular expressions. Check out the Tutorial tab for learning materials and an instructional video!

Task
Consider a database table, Emails, which has the attributes First Name and Email ID. Given  rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .

Input Format

The first line contains an integer, , total number of rows in the table.
Each of the  subsequent lines contains  space-separated strings denoting a person's first name and email ID, respectively.

Constraints

Each of the first names consists of lower case letters  only.
Each of the email IDs consists of lower case letters ,  and  only.
The length of the first name is no longer than 20.
The length of the email ID is no longer than 50.
Output Format

Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.

Sample Input
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output
julia
julia
riya
samantha
tanya
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {

    public static boolean regExp(String s)
    {
        String myRegExString = "@gmail.com";

        Pattern p = Pattern.compile(myRegExString);

        Matcher m = p.matcher(s);

        if( m.find() )
            return true;
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.nextLine(); // reading space
        ArrayList<String> out = new ArrayList<String>();
        for(int i=0;i<n; i++)
        {
            String s = sc.nextLine();
            String[] part = s.split(" ");
            if(regExp(part[1]))
            {
                out.add(part[0]);
            }
        }
        Collections.sort(out);

        for(String o: out)
        {
            System.out.println(o);
        }

    }
}