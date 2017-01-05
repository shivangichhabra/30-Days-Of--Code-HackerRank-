/*
Objective
Today, we're delving into Inheritance. Check out the Tutorial tab for learning materials and an instructional video!

Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string, .
A string, .
An integer, .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
Grading.png

Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains , , and , respectively. The second line contains the number of test scores. The third line of space-separated integers describes .

Constraints

Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

Sample Input
Heraldo Memelli 8135627
2
100 80

Sample Output
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 */


import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores)
    {
        super(firstName,lastName,idNumber);
        this.testScores = testScores;
    }

    public double averageScore(int[] testScores)
    {
        int total_sum = 0;
        for(int i=0; i<testScores.length; i++)
        {
            total_sum += testScores[i];
        }

        double avg =  (double) total_sum / testScores.length;
        return avg;
    }

    public char calculate()
    {
        char grade=' ';
        double score = averageScore(testScores);
        if(score >= 90 && score <= 100)
        {
            grade = 'O';
        }
        else if (score >= 80 && score < 90)
        {
            grade = 'E';
        }
        else if (score >= 70 && score < 80)
        {
            grade = 'A';
        }
        else if (score >= 55 && score < 70)
        {
            grade = 'P';
        }
        else if (score >= 40 && score < 55)
        {
            grade = 'D';
        }
        else
        {
            grade = 'T';
        }
        return grade;
    }
}
class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}