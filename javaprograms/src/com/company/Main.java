package com.company;
//take user input we have to import this module
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello world");

        //sum of two numbers
/*
        int num1 = 10;
        int num2 = 20;
        int result = num1+num2;
        System.out.println("The sum is: "+result);
*/

        //literals
/*
        byte age = 32;
        int age2 = 20;
        short age3 = 70;
        long number_Long = 5666882224l;
        char ch = 'B';
        float num = 3.6f;
        double num2 = 4.66d;
        boolean x = true;
        System.out.println(ch);
 */

        //user input
        //integer value
/*
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int x = sc.nextInt();
        System.out.println("Enter second num");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum of two number is: "+sum);

        //float value
        System.out.println("Enter float num1");
        float num1 = sc.nextFloat();
        System.out.println("enter float num2");
        float num2 = sc.nextFloat();
        float res = num1+num2;
        System.out.println("The result is: "+res);

        //checking datatype of user input
        System.out.println("write number...");
        boolean val = sc.hasNextInt();
        System.out.println(val);

        //print user input
        String str = sc.nextLine();
        System.out.println(str);

        //read first word
        String str2 = sc.next();
        System.out.println(str2);
*/

        //operators in java

        int a = 5;
        int b = 4;
        int res = a%b; //airthmatic , modulus operator
        b *= 3; //assignment operator
        System.out.println(res);
        System.out.println(b);
        System.out.println(6==4); //comparison operator
        System.out.println(6<9 && 3<4); //logical operaotr
        System.out.println(2&3); //bitwise operator






























    }
}
