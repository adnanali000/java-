package com.company;
//take user input we have to import this module
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //for user input
        Scanner sc = new Scanner(System.in);
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
/*
        int a = 5;
        int b = 4;
        int res = a%b; //airthmatic , modulus operator
        b *= 3; //assignment operator
        System.out.println(res);
        System.out.println(b);
        System.out.println(6==4); //comparison operator
        System.out.println(6<9 && 3<4); //logical operaotr
        System.out.println(2&3); //bitwise operator


*/

        //precedence and associativity
        //precedence of / and * are equal.
        //associativity of / and * start left to right
/*
        int a = 3*4+12/3;
        //12/3 = 4
        //3*4 = 12
        // 12+4 = 16
        System.out.println(a);

        int b = 60/5 - 34*2;
        System.out.println(b);

*/
        //datatype of expression
/*
        //byte + short = int
        // s + i = i
        //l+f = f
        //i+f = f
        //c+i = i
        //c+s = i
        //l+d = d
        //f+d = d

        //increment and decrement operator

        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(--i);

*/

                //INTRODUCTION TO STRINGS

        /*
//string as an object
        String name = new String("adnan");
        System.out.println(name);
//string as a data type
        String name2 = "Adnan";
        System.out.println(name2);
 //different type of print
        System.out.print("hello world"); //this will not print the new line
        System.out.println("hello world"); //this will print the new line
  //for c programmers
        int a = 10;
        float b = 3.455f;
        System.out.printf("The value of a is %d and value of b is %f \n",a,b);
        System.out.format("The value of a is %d and value of b is %f \n",a,b); //both are same
//taking string input from user
        System.out.println("Enter input");
        String inp = sc.nextLine(); //print whole string
        System.out.println(inp);

*/
        //methods in string

        /*

        String name = "Adnan";
        System.out.println(name);

        int len = name.length();
        System.out.println(len);

        String  lowc = name.toLowerCase();
        System.out.println(lowc);

        String  uppc = name.toUpperCase();
        System.out.println(uppc);

        String nonTrimStr = "       Hello my name is adnan       ";
        System.out.println(nonTrimStr);
        System.out.println(nonTrimStr.trim());//remove extra space from start and end

        String substr = name.substring(2);
        System.out.println(substr); //nan
        System.out.println(name.substring(1,5));

        String rep = name.replace('n','a');
        System.out.println(rep);
        System.out.println(name.replace("Adn","ada"));

        boolean startwith = name.startsWith("Ad");
        System.out.println(startwith);
        System.out.println(name.startsWith("ad"));

        boolean endWit = name.endsWith("an");
        System.out.println(endWit);

        char chrat =  name.charAt(1);
        System.out.println(chrat);

        int indof = name.indexOf("dn");
        System.out.println(indof);
        System.out.println(name.indexOf("a",3));

        int lindOf = name.lastIndexOf("n");
        System.out.println(lindOf);

         boolean equ = name.equals("Adnan");
        System.out.println(equ);
        System.out.println(name.equalsIgnoreCase("ADNAn"));
*/

























    }
}
