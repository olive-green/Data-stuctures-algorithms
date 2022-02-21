import java.io.*;
import java.util.*;

public class Main{
    public static int dtoBinary(int n){
        int ans=0;
        int power=1;
        while(n!=0){
            int rem=n%2;
            n=n/2;
            ans+=(rem*power);
            power*=10;
        }
        return ans;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    int ts=(int)Math.pow(2,n);
    for(int i=0;i<ts;i++){
        int bn=dtoBinary(i);
        // System.out.println(bn);
        int div=(int) Math.pow(10,n);
        for(int j=0;j<n;j++){
            int q=bn/div;
            int rem=bn%div;
            if(q==1){
                System.out.print(arr[j]+"\t");
            }
            else{
                System.out.print("-\t");
            }
            bn=rem;
            div/=10;
        }
        System.out.println();
    }
 }

}