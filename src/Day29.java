/*
Objective
Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.

Constraints

Output Format

For each test case, print the maximum possible value of  on a new line.

Sample Input
3
5 2
8 5
2 2

Sample Output
1
4
0
 */

import java.util.Scanner;

public class Day29 {

    public static void Bitwise(int N, int K)
    {
        int max = 0;
        for(int i=1; i<=N; i++)
        {
            for(int j=i+1; j<=N ; j++)
            {
                int temp = i&j;
                if(max < temp  && temp < K)
                {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            Bitwise(N,K);
        }
    }
}