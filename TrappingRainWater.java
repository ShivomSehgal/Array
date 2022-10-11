Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.
  
  
  
  
  
  
  class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        
        int leftIdx = 0;
        int rightIdx = n-1;
        int leftMax = arr[leftIdx];
        int rightMax = arr[rightIdx];
        long sum = 0;
        
        while(leftIdx < rightIdx){
            
            if(arr[leftIdx] < arr[rightIdx]){
                leftMax = Math.max(arr[leftIdx], leftMax);
                sum += (long) (leftMax - arr[leftIdx++]);
            }else{
                rightMax = Math.max(arr[rightIdx], rightMax);
                sum += (long) (rightMax - arr[rightIdx--]);
            }
        }
        
        return sum;
    } 
}
  
