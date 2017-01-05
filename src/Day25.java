/*
Objective
Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

Task
A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number, , determine and print whether it's  or .

Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines contains an integer, , to be tested for primality.

Constraints

Output Format

For each test case, print whether  is  or  on a new line.

Sample Input
3
12
5
7

Sample Output
Not prime
Prime
Prime

 */
import java.util.Scanner;

public class Day25 {

    public static void checkPrime(int num)
    {
        if(num == 1)
        {
            System.out.println("Not prime");
            return;
        }
        int sqrt = (int)Math.sqrt(num);

        for(int j=2; j<sqrt; j++)
        {
            if(num%j == 0)
            {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int num = sc.nextInt();
            checkPrime(num);
        }

    }
}
