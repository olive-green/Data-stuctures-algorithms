input-
17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11
output-
5
6
7
8
9
10
11
12
13
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }
    
    HashSet<Integer> s=new HashSet<Integer>();
    int ans=0;
    int sp=arr[0];//(starting point)
    for(int i=0;i<n;i++){
        s.add(arr[i]);
    }
    
    for(int i=0;i<n;i++){
        if(!s.contains(arr[i]-1)){
            int count=1;
            int j=arr[i]+1;
            while(s.contains(j)){
                j++;
                count++;
            }
            //we are not using Math.max function because we want ans to update only when there is greater length present not on equal length as question demands print one for which sp occurs first in array 
// ex:- 
// 14        
// 10
// 6
// 12
// 2
// 5
// 3
// 10
// 14
// 3
// 15
// 15
// 12
// 10
// 14
ans-2,3

            if(ans<count){
                ans=count;
                sp=arr[i];
            }
            
        }        
    }
    
    //print ans
    for(int i=0;i<ans;i++){
        System.out.println(sp+i);
    }
 }

}