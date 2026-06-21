package Day_25;

import java.util.Scanner;

// Q97. Write a program to Merge two sorted arrays.
public class Question_97 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merge = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        while (j < n2) {
            merge[k++] = arr2[j++];
        }

        System.out.println("Merged Array:");

        for (int num : merge) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}