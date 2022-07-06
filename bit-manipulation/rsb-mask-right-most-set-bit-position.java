1. You are given a number n.
2. You have to print the right-most set bit mask.

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    //write your code here
    
    // int ans=n & (~n +1);
    System.out.println(Integer.toBinaryString(n & ((~n) + 1)));
  }

}