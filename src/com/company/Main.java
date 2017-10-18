package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String Quit = "";
        int counter = 0;
        while (!Quit.equalsIgnoreCase("Yes"))
        {
            Scanner scan = new Scanner(System.in);

            ArrayList<Person> personlist = new ArrayList<Person>();
            Person name1 = new Person();


            System.out.println("Enter your FirstName");
            name1.setFirstName(scan.nextLine());
            System.out.println("Enter your Lastname");
            name1.setLastName(scan.nextLine());
            System.out.println("Enter your address");
            name1.setAddress(scan.nextLine());
            System.out.println("Enter your phoneNumber");
            name1.setPhoneNumber(scan.nextLine());
            System.out.println("Enter your email");
            name1.setEmail(scan.nextLine());

            personlist.add(name1);         //This is the array which accept input until the counter reaches


            //for(Person eachperson:personlist)
            for (int counter1 = 0; counter1 < 1; counter1++)

            {
                System.out.println("The FirstName is :" + personlist.get(0).getFirstName());
                System.out.println("Do you want to Quit: Yes/No");
                Quit = scan.nextLine();
                counter++;
            }
        }
    }
}



