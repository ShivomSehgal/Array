Given an array Arr[] of N positive integers. The task is to find the maximum of j - i 
subjected to the constraint of Arr[i] <= Arr[j].

Example 1:

Input:
N = 9
Arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output: 6
Explanation: In the given array Arr[1] <
Arr[7]  satisfying the required condition
(Arr[i] <= Arr[j])  thus giving the
maximum difference of j - i which is
6(7-1).

Your Task:
Complete the function maxIndexDiff() which takes array arr and size n, as input parameters 
and returns an integer representing the answer. You don't to print answer or take inputs. 
  
  
  
  
  class Solution {

    int maxIndexDiff(int arr[], int n) {
        int ans = 0;
        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        
        for(int i=1;i<n;i++){
            leftMin[i] = Math.min(leftMin[i-1], arr[i]);
        }
        
        int i=n-1, j = n-1;
        
        while(j >= 0 &&  i >= 0 ){
            if(arr[j] >= leftMin[i]){
                    ans = Math.max(ans, j-i);
                    i--;
                }
            else{
            j--;
            }
        }
        return ans;
    }
}
