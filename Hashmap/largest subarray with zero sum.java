import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
		// write your code here
        HashMap<Long,Integer> mp=new HashMap<>();
        //logic
        // we keep calculating sum and maintain a map with key as sum and value as first index where we get that sum now we checks if we get the same sum again that means there is an subarray whose sum must be zero between them
        long sum=0;
        int ans=0;
        // mp.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
            else{
                ans=Math.max(ans,i-mp.get(sum));
            }
        }
		return ans;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}
