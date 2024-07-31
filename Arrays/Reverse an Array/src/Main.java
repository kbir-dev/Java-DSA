import java.util.*;

public class Main {
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array : ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array : ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        reverseArray(arr);
        System.out.println("\nYour Array after reverse: ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}