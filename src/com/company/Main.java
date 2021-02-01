package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

               double result;
               Scanner commandLine = new Scanner(System.in);
               System.out.print("Input two numbers ... ");
               int num1 = commandLine.nextInt();
               int num2 = commandLine.nextInt();

                  if (num1<0 | num1>100) {
                     result = num1 * 105 /100.0;
                     System.out.println(result); }
                  else {
                      result= num1*num2/100.0;
                      System.out.println(result);

                  }

                  if (result*100/num1==105){
                      System.out.println("Your number doesn't belong  to the range of (0;100)");
                  }  else {
                      System.out.println("Your number belongs to the range of  (0,100)");
                  }
   }
}

