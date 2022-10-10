Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
  
  
  
  
  class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
       return inversionCount(arr,0,N);
    }
    static long inversionCount(long[] arr, long p, long r){
        //  long p = 0, r =  N;
        long value = 0;
        
         if(r-p<=1) return 0;
         
            long q = (p+r)/2;
           long left = inversionCount(arr,p,q);
           long right = inversionCount(arr,q,r);
           long merged = merge(arr,p,q,r);
           
            value = merged + left + right;
        
        return value;
    }
    static long merge(long[] arr, long p, long q, long r){
        int left1 = (int)p, right1 = (int)q;
        int left2 =(int) q, right2 = (int)r;
        List<Long> list = new ArrayList<>();
        long inv = 0;
        while(left1 < right1 && left2 < right2){
           if(arr[left1] <= arr[left2]){
               list.add(arr[left1++]);
           }else{
               inv += right1 - left1;
               list.add(arr[left2++]);
           }
        }
        for(int i=left1;i<right1;i++){
            list.add(arr[i]);
        }
         for(int i=left2;i<right2;i++){
            list.add(arr[i]);
        }
        
         for(int i=0;i<list.size();i++){
             int idx = (int)p;
            arr[idx + i] = list.get(i);
        }
        return inv;
        
        
    }
}
