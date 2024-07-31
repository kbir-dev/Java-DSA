package com.karan;
import java.util.*;

public class Main {
    public static void swap(int[] arr,int x,int y){
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter Your Numbers : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Array is : \n");
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        swap(arr,1,4);
        System.out.println("\nYour Array after Swapping is :");
        for(int i = 0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}