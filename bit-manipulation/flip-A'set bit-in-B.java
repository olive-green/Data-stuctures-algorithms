1. You are given two numbers A and B.
2. You have to print the count of bits needed to be flipped to convert 'A' to 'B'.
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    //write your code here
    int xor=a^b;
    //now count the set bits in xor that is our ans 
    int count=0;
    while(xor>0){
        int rsb= xor & (-xor);
        if(rsb!=0)
            count++;
        xor=xor^rsb;
    }
    System.out.println(count);
  }

}