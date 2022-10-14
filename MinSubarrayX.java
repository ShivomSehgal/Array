Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Explanation:
Minimum length subarray is {10}





class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
       
    //   Can be optimised further by using startIdx instead of deque --> Space - O(1)
       
    //   Optimal approach -- > time - O(n), space - O(n)
    
       Deque<Integer> queue = new LinkedList<>();
    //   queue.addLast(a[0]);
       
       int currentSum = 0;
       int minValue = Integer.MAX_VALUE;
       
       for(int i=0;i<n;i++){
           
        //   if(queue.isEmpty()){ 
        //       queue.add(a[i]); 
        //       currentSum += a[i];
        //       continue;
        //   }
           
           queue.addLast(a[i]);
           currentSum += a[i];
           
           if(currentSum > x) {
               minValue = Math.min(minValue, queue.size());
           }
           
           if(currentSum - queue.peekFirst() > x){
               while(currentSum - queue.peekFirst() > x){
              int val =  queue.removeFirst();
               currentSum -= val;
               minValue = Math.min(minValue, queue.size());
           }
           }
           
       }
       
        return minValue == Integer.MAX_VALUE ? 0 : minValue;
    }
}

