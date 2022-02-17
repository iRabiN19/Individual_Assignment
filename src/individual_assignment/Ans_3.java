package individual_assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ans_3 {
    public static void main(String[] args) {
        String[] arr = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter name" + (i+1)+":");
            arr[i] = sc.next();

        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println();
        for (int i = 0; i < arr.length;i++){
            System.out.println("The names in descending order: " + arr[i]);
        }
    }
}


