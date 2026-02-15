package Arrays.one_d_array.claude;

public class q11 {
    public static void main(String[] args) {

        int [] arr = {0,0,1,2,2,3,3,4,4,5,6,6};
         int i = 0;

            for (int j = 1; j<arr.length; j++){
                if (arr[j]!=arr[i]){
                    i++;
                    arr[i]=arr[j];
                }
            }
            System.out.println("no of different elements in the array: "+(i+1));
    }
    
}
