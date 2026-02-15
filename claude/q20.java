package Arrays.one_d_array.claude;

import java.util.Arrays;

public class q20 {
    public static void main(String[] args) {

int[] arr = {1,2,3,6,4,8,9,10};
Arrays.sort(arr);  
int count = 1;
int maxCount = 1;

for (int x : arr)
    System.out.print(x + " ");
System.out.println();

for (int i = 1; i<arr.length; i++){
    if (arr[i]==arr[i-1]+1){
        count++;
    } else if (arr[i]!=arr[i-1]){
        maxCount = Math.max(maxCount, count);
        count = 1;
    }
}
    maxCount = Math.max(maxCount, count);
    System.out.println("The number of consequitive terms in the array is "+maxCount);
    }
}
