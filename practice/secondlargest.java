package Arrays.one_d_array.practice;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the length of an array: ");
      int length = sc.nextInt();
      int [] A = new int [length];
      int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
      System.out.println("enter the value in array: "); 
      
      for (int i = 0; i<A.length; i++){
        A[i]= sc.nextInt();
      }
        
      for (int i = 1; i<A.length; i++){
         
        if (A[i]>max1){
            max2 = max1;
            max1 = A[i];
        } else if (A[i]>max2 && A[i]!=max1) {
            max2 = A[i];
        }
    }
      System.out.println("Second largest "+max2);
      sc.close();
    }
}
