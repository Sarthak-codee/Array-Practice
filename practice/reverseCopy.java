package Arrays.one_d_array.practice;

public class reverseCopy {
    
        public static void main(String[] args) {
        int a[] = new int [10];
        int b[] = new int [10];
        System.out.print("Original array: ");
        for (int i = 0; i<a.length; i++){
            a[i] = i+1;
            System.out.print(a[i]+(i<a.length-1?",":""));
        }
        System.out.println();
        int num = 0;
        System.out.print("Reverse Array: ");
        for (int i = a.length-1; i>=0; i--){
            b[num] = a[i];
            System.out.print(b[num]+ (i>=1?",":"")); 
            num++;
        }
    }
}
