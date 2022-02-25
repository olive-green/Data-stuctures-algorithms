import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        //transpose of a matrix
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                //swap the elements
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //now reverse the rows
        
        for(int i=0;i<arr.length;i++){
            //we are reversing each rows
            int l=0;
            int r=arr.length-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }

        //2nd method
        // here we are reversing columns
        // int l=0;
        // int r=arr.length-1;
        // while(l<r){

        //     for(int i=0;i<arr.length;i++){
        //         
        //             int temp=arr[i][l];
        //             arr[i][l]=arr[i][r];
        //             arr[i][r]=temp;
                
        //     }
        //             l++;
        //             r--;
        // }


        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}