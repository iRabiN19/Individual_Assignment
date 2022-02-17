package individual_assignment;

import java.util.Scanner;
public class Ans_2 {
    static int check(int num1, int num2){

        if(num1==num2){     return 0;   }
        else if(num1%7==num2%7){             return Math.min(num1,num2);        }
        else {             return Math.max(num1,num2);         }
    }
    public static void main(String[] args) {
        int first, second, result, remainder;
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the first number: ");
            first = sc.nextInt();
            System.out.print("Enter the second number: ");
            second = sc.nextInt();
            System.out.println();
            System.out.println("First integer: " + first);
            System.out.println("Second integer: " + second);
            System.out.println();
            result = check(first, second);
            if (result == 0) {
                System.out.println("Both the integers are equal.");
            } else System.out.println("Returned value: " + result);
            System.out.println();
            System.out.print("Do you wish to continue?(y/n): ");
            ch=sc.next().charAt(0);
        }while(ch=='y');
    }
}
