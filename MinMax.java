Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

 

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789
  
  
  
  
  
  
  
  
  class Compute 
{
    static pair getMinMax(long arr[], long n)  
    {
        // Optimised approach --> Time - O(n), Space - O(1)
        
        long currentMax = arr[0];
        long currentMin = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(currentMax < arr[i]){
                currentMax = arr[i];
            }
            if(currentMin > arr[i]){
                currentMin = arr[i];
            }
        }
        
        return new pair(currentMin, currentMax);
        
        
        // Optimised approach
        // long currentMax = arr[0];
        // long currentMin = arr[0];
        
        // for(int i=1; i<arr.length; i++){
        //   currentMax = Math.max(currentMax, arr[i]);
        //   currentMin = Math.min(currentMin, arr[i]);
        // }
        
        // return new pair(currentMin, currentMax);
        
        
        //  Brute force --> Time - O(nlogn), Space - O(1)
        
        // Arrays.sort(a);
        
        // return new pair(a[0], a[a.length-1]);
    }
}
