class Solution{
    public:
    //Function to count subarrays with sum equal to 0.
    ll findSubarray(vector<ll> arr, int n ) {
        //code here
        //logic is we keep adding elements and store sum in map if that sum repeats again that
        // means we got a subarray
        unordered_map<ll,int>mp;
        int ans=0;
        ll sum=0;
        //for first element as zero
        mp[0]=1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
    
            if(mp.find(sum)!=mp.end()){
                ans+=mp[sum];
            }
            mp[sum]++;
        }
        return ans;
        
    }
};