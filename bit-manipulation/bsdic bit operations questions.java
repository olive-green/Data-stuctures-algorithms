1. You are given a number n.
2. Print the number produced on setting its i-th bit.
3. Print the number produced on unsetting its j-th bit.
4. Print the number produced on toggling its k-th bit.
5. Also, Check if its m-th bit is on or off. Print 'true' if it is on, otherwise print 'false'.

input- 57
3 
3 
3 
3
output-
57
49
49
true

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    int mask=1<<i;
    int ans1=n|mask;
    System.out.println(ans1);
    
    //2nd part
    mask=1<<j;
    mask=~mask;
    int ans2=n&mask;
    System.out.println(ans2);
    
    //3rd part
    mask=1<<k;
    int ans3=n^mask;
    System.out.println(ans3);
    
    // 4th part
    mask=1<<m;
   
    int ans4=n&mask;
    if(ans4==0)
    System.out.println(false);
    else
    System.out.println(true);
    
  }

}