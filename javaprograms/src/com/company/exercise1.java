package com.company;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        //write a program to calculate percentage of a given student in exam.
        // His marks from 5 subjects must be taken as input from the keyboard.(marks are out of 100)

        Scanner sc = new Scanner(System.in);

        /*

        System.out.println("Enter your english marks");
        float english = sc.nextInt();
        System.out.println("Enter your math marks");
        float math = sc.nextInt();
        System.out.println("Enter your science marks");
        float science = sc.nextInt();
        System.out.println("Enter your history marks");
        float history = sc.nextInt();
        System.out.println("Enter your geography marks");
        float geography = sc.nextInt();

       double totalMarks = english+math+science+geography+history;
       double percentage = (totalMarks/500) * 100;

        System.out.println("Your Percentage is: "+percentage+"%");
    */

        //program to calculate CGPA
 /*
        float sub1 = 76;
        float sub2 = 90;
        float sub3 = 77;

        float cgpa = (sub1+sub2+sub3) / 30;
        System.out.println("Your cgpa is: "+cgpa);
*/

        //program to greet user
/*
        System.out.println("Enter your name..");
        String name = sc.next();
        System.out.println("Hey "+name+" have a good day");
*/
        //check input whether it is int or not
/*
        System.out.println("Enter number");
        boolean num = sc.hasNextInt();
        System.out.println(num);
  */

        //what will be the result of the following expression
//        float a = 7/4 * 9/2; //ans = 4 which is wrong
/*
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
*/
        //right a java program to encrypt a grade by adding 8 in it and decrypt it to show correct grade.

        //encrypt
        char grade = 'C';
        grade = (char)(grade+8);
        System.out.println(grade);

        //decrypt
        grade = (char)(grade-8);
        System.out.println(grade);


    }
}
