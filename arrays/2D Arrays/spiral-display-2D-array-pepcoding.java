import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=scn.nextInt();
         }
       }
       
       int rmin=0;
       int cmin=0;
       int cmax=m-1;
       int rmax=n-1;
       int count=0;
       while(count<n*m){
        //left boundary
        for(int i=rmin;i<=rmax &&count<n*m;i++){
            System.out.println(arr[i][cmin]);
            count++;
        }

        //bottom boundary
        cmin++;
        
        for(int i=cmin;i<=cmax&&count<n*m;i++){
            System.out.println(arr[rmax][i]);
            count++;
        }

        //right boundary
        rmax--;
        for(int i=rmax;i>=rmin&&count<n*m;i--){
            System.out.println(arr[i][cmax]);
            count++;
        }

        //upper boundary
        cmax--;
        for(int i=cmax;i>=cmin&&count<n*m;i--){
            System.out.println(arr[rmin][i]);
            count++;
        }
        rmin++;
       }
       


    }

}