import javafx.print.Printer;

import java.util.Scanner;

/*
Objective
Today we're discussing Generics; be aware that not all languages support this construct, so fewer languages are enabled for this challenge. Check out the Tutorial tab for learning materials and an instructional video!

Task
Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.

Note: You must use generics to solve this challenge. Do not write overloaded functions.

Input Format

There is no input for this challenge. The locked Solution class in your editor will pass two different types of arrays to your printArray function.

Constraints

You must have exactly  function named printArray.
Output Format

Your printArray function should print each element of its generic array parameter on a new line.

Sample Input
3
1
2
3
2
Hello
World

Sample Output
1
2
3
Hello
World

 */
class PrinterGeneric <T> {
    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Day21 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        PrinterGeneric<Integer> intPrinter = new PrinterGeneric<Integer>();
        PrinterGeneric<String> stringPrinter = new PrinterGeneric<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(PrinterGeneric.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}