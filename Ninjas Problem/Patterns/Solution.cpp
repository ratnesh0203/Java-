class Solution{
    public:
    long long gcd(long a, long b) 
{ 
    // Find Minimum of a and b 
    long long result = min(a, b); 
    while (result > 0) { 
        if (a % result == 0 && b % result == 0) { 
            break; 
        } 
        result--; 
    } 
  
    // Return gcd of a and b 
    return result; 
} 
    long long CountBouquets(int N, long long K, vector<long long>& arr)
    {
        vector<long long>prefixg(N+1);
        
        prefixg[0] =1;
        for(int m =1; m<=N; ++m){
            prefixg[m] = gcd(prefixg[m-1],arr[m-1]);
        }
        
        long long count =0;
        for(int i=0; i<N; ++i){
            int j =i;
            while(j<N && gcd(prefixg[j+1], prefixg[i])<=K){
                ++j;
            }
            count+=j-i;
        }
        return count/2;
    }
};