package Arrays.one_d_array.practice;

public class deleting {
    public static void main(String[] args) {

        int arr [] = new int [10];
        int a = 1;
        for (int i = 0; i<arr.length; i++){
            arr[i] = a;
            a++;
            System.out.print(arr[i]+",");
        }
        System.out.println();

        // i want to delete the array at index 2

        for (int i = 3; i<arr.length; i++){
            arr [i-1] = arr[i];
        }
        arr[arr.length-1]=0;

        for (int x: arr)
        System.out.print(x+","); 
        System.out.println();
    }
}
