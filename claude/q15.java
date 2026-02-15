package Arrays.one_d_array.claude;

public class q15 {
    public static void main(String[] args) {

        int arr [] = {1,1,3,4,4,3,2,5,6,5,6,2,9};
        
        for (int i = 0; i<arr.length; i++){
            int count = 0; 
            for (int j = 0; j<arr.length ; j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(arr[i]);
            }
        }

    }
}
