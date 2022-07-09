import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            //binary search iterative 
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int target=scn.nextInt();
            int i=0,j=n-1;
            while(i<=j){
                int mid=i+(j-i)/2;
                if(arr[mid]==target)
                {
                    System.out.println(mid+1);
                    break;
                }
                else if(arr[mid]<target)
                    i=mid+1;
                else 
                    j=mid-1;
            }
            if(i>j)
                System.out.println("NOT Found");
    }
}