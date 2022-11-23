package practice;

import java.util.Scanner;

public class getIntUserInput {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter some integer number:\n");
        int num=scanner.nextInt();
        System.out.println("You entered this number: "+num);

    }
}
