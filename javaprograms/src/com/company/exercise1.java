package com.company;
import java.util.Locale;
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
/*
        //encrypt

        char grade = 'C';
        grade = (char)(grade+8);
        System.out.println(grade);

        //decrypt
        grade = (char)(grade-8);
        System.out.println(grade);
*/

        //using comparison operator to find out whether a given number is greater than  the user
        //entered number or not.

/*
        System.out.println("Enter number");
        int user = sc.nextInt();
        System.out.println(user>10);
*/
        //question
 /*
        float v = 10;
        float u = 6;
        float a = 20;
        float s = 2;
        float formula = (v*v - u*u) / (2*a*s);
        System.out.println(formula);
*/
        //question
        /*
        int x = 7;
        int a = x*49/x + 35/x;
        System.out.println(a);
*/

        //write a program to convert string in lowercase
 /*
        String name = "HELLO world";
        System.out.println(name.toLowerCase());
*/

        //program to replace spaces with underscore
        String comp = "K F C";
        System.out.println(comp.replace(" ","_"));

    }
}
