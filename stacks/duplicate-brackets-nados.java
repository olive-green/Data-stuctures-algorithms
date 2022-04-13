import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String exp= scn.nextLine();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)!=')'){
                st.push(exp.charAt(i));
            }
            else{
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop(); //this pop is for removing '(' bracket because above while loop breaks on opening bracket
                }
            }
        }
            System.out.println(false);
    }

}