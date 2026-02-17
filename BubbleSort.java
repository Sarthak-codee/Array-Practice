package All_Sorting_Type;


public class BubbleSort {
    public static void main(String[] args) {
        
        int arr [] = {2,1,6,4,3,10};

        for (int x:arr)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i<arr.length; i++){
            for (int j = 1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
}
