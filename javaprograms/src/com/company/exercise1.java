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

        System.out.println("Enter your name..");
        String name = sc.next();
        System.out.println("Hey "+name+" have a good day");

    }
}
