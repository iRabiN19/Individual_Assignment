package individual_assignment;

import java.util.Scanner;

public class Ans_1 {
    static void convert(int n){
        int [] binary =new int[10];

        int i=0;
        while(n>0){
            binary[i]=n%2;
            n/=2;
            i++;
        }

        for(int j = i-1; j>= 0; j--){
            System.out.print(binary[j]);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        n= sc.nextInt();
        System.out.println();
        System.out.println("Decimal value:     "+n);
        System.out.print("Binary equivalent:  ");
        convert(n);
    }
}
