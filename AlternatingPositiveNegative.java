Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

Example 2:

Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
  
  
  
  
  
//   Optimal approact --> Space - O(1), Time - O(n2)
//   GeeksForGeeks has testcase 7 wrong here
  
  class Solution {
    void rearrange(int arr[], int n) {
        boolean positive = true;
        
        for(int i=0;i<n;i++){
            
            if(positive && arr[i] < 0){
                
                int j = findNext(positive, arr, i);
                if(j == i) break;
                int temp = arr[j];
                rotate(i,j, arr);
                arr[i] = temp;
                
            }else if(!positive && arr[i] >= 0){
                
                int j = findNext(positive, arr, i);
                if(j == i) break;
                int temp = arr[j];
                rotate(i,j, arr);
                arr[i] = temp;
                
            }
            positive  =  !positive;
        }
    }
    
    public void rotate(int k, int j, int[] arr){
        for(int i = j;i>k;i--){
            arr[i] = arr[i-1];
        }
    }
    
    int findNext(boolean flag, int[] arr, int startIdx){
        for(int i=startIdx;i<arr.length;i++){
            if(flag && arr[i] > 0) return i;
            else if(!flag && arr[i] < 0) return i;
        }
        return startIdx;
    }
}
