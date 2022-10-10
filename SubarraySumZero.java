Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
Example 2:

Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.
  
  
  
  static boolean findsum(int arr[],int n)
    {
        
        // Optimal Solution --> Time - O(n), Space - O(n)
        Set<Integer> set = new HashSet<>();
        int val = 0;
        for(int i : arr){
            val += i;
            if(set.contains(val) || val == 0) return true;
            set.add(val);
        }
        return false;
    }
