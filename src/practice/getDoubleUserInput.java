package practice;

import java.util.Scanner;

public class getDoubleUserInput {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter some decimal number:\n");
        double num=scanner.nextDouble();
        System.out.println("You entered this number: "+num);
    }
}
