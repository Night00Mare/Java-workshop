package com.alireza.usc;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        Employee p5 = new Employee();
        Employee p1 = new Employee();
        Employee p2 = new Employee();
        Employee p3 = new Employee();
        Employee p4 = new Employee();

        System.out.println("you can handle information about 5 employee....Lets go");

        for (int counter=1 ; counter<=5;counter++) {

            while (true) {
                try {
                    System.out.println("just tell me witch one are u talking about :");
                    number = Integer.parseInt(scanner.next());
                    if (number!=counter){// for getting number 1 to 5 with out forgetting ny one
                        System.out.println("dude there is some one in the line !!!....try again");
                        continue;
                    }
                    System.out.println("well done ... know give me some info about person number :" + number);

                    break;
                } catch (NumberFormatException problem) {
                    System.out.println("dude just give me the number :)\n" + "lets try again");
                }


            }

            System.out.println("WARNING!!! >> Careful to give information by this format: 1 = name 2 = id 3 = age 4 = salary");
            try {


                switch (number) {

                    case 1:

                        p1.name = scanner.next();

                        p1.id = Long.parseLong(scanner.next());

                        p1.age = Integer.parseInt(scanner.next());

                        p1.salary = Float.parseFloat(scanner.next());

                        break;
                    case 2:

                        p2.name = scanner.next();

                        p2.id = Long.parseLong(scanner.next());

                        p2.age = Integer.parseInt(scanner.next());

                        p2.salary = Float.parseFloat(scanner.next());
                        break;
                    case 3:

                        p3.name = scanner.next();

                        p3.id = Long.parseLong(scanner.next());

                        p3.age = Integer.parseInt(scanner.next());

                        p3.salary = Float.parseFloat(scanner.next());

                        break;

                    case 4:

                        p4.name = scanner.next();

                        p4.id = Long.parseLong(scanner.next());

                        p4.age = Integer.parseInt(scanner.next());

                        p4.salary = Float.parseFloat(scanner.next());

                        break;

                    case 5:
                        p5.name = scanner.next();

                        p5.id = Long.parseLong(scanner.next());

                        p5.age = Integer.parseInt(scanner.next());

                        p5.salary = Float.parseFloat(scanner.next());

                        break;
                }

            }catch (NumberFormatException problem){
                System.out.println("dude u made a mistake ... lets start from the beginning!!!");
                counter--;
                continue;

            }
        }

        System.out.println("well done ... know let us to take a look aat it");

        System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n"+p5);












    }


}
