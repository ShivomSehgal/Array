Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

Example 1:

Input : 
arr[ ] = {2, 1, 5, 6, 3} 
K = 3
Output : 
1
Explanation:
To bring elements 2, 1, 3 together,
swap index 2 with 4 (0-based indexing),
i.e. element arr[2] = 5 with arr[4] = 3
such that final array will be- 
arr[] = {2, 1, 3, 6, 5}

Example 2:

Input : 
arr[ ] = {2, 7, 9, 5, 8, 7, 4} 
K = 6 
Output :  
2 
Explanation: 
To bring elements 2, 5, 4 together, 
swap index 0 with 2 (0-based indexing)
and index 4 with 6 (0-based indexing)
such that final array will be- 
arr[] = {9, 7, 2, 5, 4, 7, 8}














class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        
        int nk = 0;
        int minSwaps = Integer.MAX_VALUE;
        for(int i : arr){
            if(i <= k) nk++;
        }
        
        for(int i=0;i<=n-nk;i++){
            int swaps = nk;
            // int elements =  nk;
            
            for(int j=i;j<i+nk;j++){
                if(arr[j] <= k) swaps--;
            }
            // while(elements-- != 0){
            // if(arr[i] <= k) swaps--;
            // }
            minSwaps = Math.min(swaps, minSwaps);
        }
        
        return minSwaps;
        
        
        
        
        
        // int prevIdx = -1;
        // int counter = 0;
        // for(int i=0;i<n;i++){
        //     if(arr[i] <= k){
        //         if(prevIdx == -1){
        //             prevIdx = i;
        //         }else{
        //             if(i - prevIdx > 1){
        //                 counter++;
        //             }
        //             prevIdx = i;
        //         }
        //     }
        // }
        // return counter;
    }
    
