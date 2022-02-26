package com.perscholas.java_basics;

public class Main {

    static void ForLoop() {
        for (int i = 1; i < 10; i++) {

            System.out.println(i);
            System.out.println("Foor LOOP =============>");
        }
    }

    static void WhileLoop() {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i += 10;
            System.out.println(" While Loop ==================>");
        }
    }
    static void RondomNumbers(){
        System.out.println("----> Print Multibles of 5 Not Including 75 and 25");
        for (int i = 1; i < 100; i++) {
            if (i  % 5 == 0 ){
                if (i != 25 && i != 75 ){
                    System.out.println(i);
                }

            }
            
        }
    }

    static void GreaterThan50() {
        System.out.println("Print Multiples of 5 but not greater than 50------------------> ");
        for (int i = 1; i < 100; i++) {
            if (i  % 5 == 0 ){
                if (i <= 50 ){
                    System.out.println(i);
                }

            }

        }
    }
    static void NestedForLoop(){
        System.out.println( " ---Nested LOOP----------- > ");
        int weeks = 2;
        int days = 5;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; i++) {
            System.out.println("-----> Nested For LOOP --");
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }
        }
    }
     static void Palindromes(){
         System.out.println("---- > palindromes with in 10 and 200");
         for(int i = 10; i < 200; i++){
             String s = String.valueOf(i);
             int l = s.length();
             char first = s.charAt(0);
             char last = s.charAt(l-1);
             if(first == last){
                 System.out.println(i);
             }
         }
     }
     static void FibonacciSequence(){
         System.out.println("------> prints the Fibonacci Sequence from 0 to 50");
         int num1 = 0;
         int num2 = 1;
         int num3;
         int count = 10;
         int i;

         //printing 0 and 1
         System.out.print(num1+" "+num2);

       //loop starts from 2 because 0 and 1 are already printed
         for(i=2; i<count; ++i)
         {
             num3 = num1 + num2;
             System.out.print(" " + num3);
             num1 = num2;
             num2 = num3;
         }


     }
     static void NestedLoop(){

        int innerLoop = 2;
        int outerLoop = 3;

         for (int i = 0; i <innerLoop ; i++) {
             for (int j = 1; j < outerLoop ; j++) {
                 System.out.println("Inner loop: i: " + i + ", j: " + j);
             }
             System.out.println("-----> Nested for Loop inside a LOOP");
         }
     }
    public static void main(String[] args) {
	// write your code here
        ForLoop();
        WhileLoop();
        RondomNumbers();
        GreaterThan50();
        NestedForLoop();
        FibonacciSequence();
        NestedLoop();
    }
}
