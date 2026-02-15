package Arrays.one_d_array.claude;

public class q19 {
    public static void main(String[] args) {
        
        int arr [] = {16,17,4,3,5,2};

        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i<arr.length; i++){
        for (int j = i+1; j<arr.length; j++){
            if (arr[i]<arr[j]){
                i++;
                j = i;
            }
        }
        System.out.println("The leader is "+arr[i]);
    }
    }
}
