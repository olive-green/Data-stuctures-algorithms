/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static String reverse(String s,int idx){
        if(idx>=s.length())
            return "";
        
        String part=reverse(s,idx+1);
        
        return part+s.charAt(idx);
        
    }
    public static String reverse2(String s){
        //change the string to char array 
        char[] str=s.toCharArray();
        
        int i=0,j=s.length()-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        //convert char array to String
        // String ans="";
        // for(int k=0;k<str.length;k++){
        //     ans+=str[k];
        // }
        // return ans;
        return String.valueOf(str);
    }
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        String s="aurbhai";
        // String ans="";
        System.out.println(reverse2(s));
	}
}