package practice;

import java.util.Scanner;

public class getNumberAndString {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=scanner.nextInt();

        //if we use nextLine method after next method.
        //we add one more nextLine method because to clear Scanner memory.
        scanner.nextLine();

        System.out.println("Enter your full name:");
        String fullName=scanner.nextLine();

        System.out.println("Full name: "+fullName);
        System.out.println("Age: "+age);
    }
}
