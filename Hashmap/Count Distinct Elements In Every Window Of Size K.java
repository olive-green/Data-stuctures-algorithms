import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] arr, int k) {
		//write your code here
		int i=0,j=0;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		HashMap<Integer,Integer> mp=new HashMap<>();
		while(j<arr.length){
		    
		        mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
		       
		        if((j-i+1)>=k){
		         ans.add(mp.size());
		        //now removing the starting of window
		        mp.put(arr[i],mp.get(arr[i])-1);
		        if(mp.get(arr[i])==0){
		            mp.remove(arr[i]);
		        }
		        i++;
		    }
		    j++;
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans = solution(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}
	}


}
