package individual_assignment;

import java.util.Scanner;

class Quicksort{
    static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j< high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }
    static void quickSort(int arr[], int low, int high){
    if(low<high){
        int p=partition(arr, low, high);
        quickSort(arr, low,p-1);
        quickSort(arr, p+1,high);
        }
    }
}
public class Ans_5 {
    static void BinarySearch(int arr[], int search, int first, int last) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < search) {
                first = mid + 1;
            } else if (arr[mid] == search) {
                System.out.println("The element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid=(first+last)/2;
        }
            if (first > last) {
                System.out.println("Not found.");
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int search, first = 0, last = size - 1;
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter the value at index " + i + " :");
                arr[i] = sc.nextInt();
            }

            Quicksort.quickSort(arr, 0, size-1);
            System.out.println("After soring: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the value to search: ");
            search = sc.nextInt();
            BinarySearch(arr, search, first, last);
            System.out.println();
            System.out.println("Do you wish to continue?(y/n)");
            ch=sc.next().charAt(0);
        } while (ch == 'y');

    }
}


