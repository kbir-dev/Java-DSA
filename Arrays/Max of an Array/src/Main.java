import java.util.*;

public class Main {
    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Your Array : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max_num = max(arr);
        System.out.print("\n Max Number is : " + max_num);
    }
}