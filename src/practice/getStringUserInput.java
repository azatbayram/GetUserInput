package practice;

import java.util.Scanner;

public class getStringUserInput {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.next();

        //scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname=scanner.next();

        System.out.println("Your name: "+name);
        System.out.println("Your surname: "+surname);

    }
}
