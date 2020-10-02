package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
	    String exit;
        Scanner scanner = new Scanner(System.in);
	    System.out.println("give the number : ");
	    number =Integer.parseInt(scanner.next());

	        if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }



	    }


    }

