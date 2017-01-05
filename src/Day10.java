/*
Objective
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

Sample Input 1
5

Sample Output 1
1

Sample Input 2
13

Sample Output 2
2
 */

import java.util.Scanner;

public class Day10 {

    public static String convert(int num)
    {
        String binary = "";
        while(num>0)
        {
            binary = num%2 + binary;
            num = num/2;
        }
        return binary;
    }

    public static void countOne(String binary)
    {
        int max = 0;
        int count1 = 0;
        for(int i=0; i<binary.length(); i++ )
        {
            if(binary.charAt(i) == '1')
            {
                count1++;
                if(max<count1)
                {
                    max = count1;
                }
            }
            else if(binary.charAt(i) == '0')
            {
                count1 = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countOne(convert(num));
    }
}