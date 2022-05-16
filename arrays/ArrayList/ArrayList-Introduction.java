//Basically Collection is a Class 
//Then List is a class which extends from Collection
//Then finally ArrayList is a class which extends from List

import java.util.*;
import java.io.*;

public class JavaCollection{
    public static void main (String[] args) throws Exception{
        Collection<Integer> values= new ArrayList<>();
        values.add(5);
        values.add(34);
        
        System.out.println(values.size());
        
        // We can implement it with List 
        List<Integer> values= new ArrayList<>();
        values.add(4);
        values.add(3);
        values.add(23);
        System.out.println(values.size());
        for(int i: values){
            System.out.println(i);
        }
        
        //Now with Array List
        ArrayList<Integer> values= new ArrayList<Integer>();
        values.add(23);
        values.add(43);
        values.add(64);
        for(int i: values){
            System.out.println(i);
        }
    }
}