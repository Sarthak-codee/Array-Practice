package Arrays.one_d_array.practice;

import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the length of an array: ");
        int length = sc.nextInt();
        int [] A = new int [length];
System.out.println("enter the value in array: ");

    for (int i = 0; i<A.length; i++){
        A[i] = sc.nextInt();
    }

for (int i = 0; i<A.length; i++){
    sum = sum + A[i];
}

System.out.println("sum of the array is "+sum);
sc.close();
}
}