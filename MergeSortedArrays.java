Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 

Example 1:

Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.
Example 2:

Input: 
n = 2, arr1[] = [10, 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20.
  
  
  
  
  class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i = n-1, j = m-1;
        int idx = -1, start = -1, end = -1;
        
        while(j>=0){
            if(arr1[i] < arr2[j]){
                j--;
            }else if(n == 1){
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j--;
            }else{
                long temp  = arr1[i];
                idx = i;
                // int p = 0, r = i;
                
                // while(p<r){
                //     int q = (p+r)/2;
                    
                //     if(arr1[q] > arr2[j]){
                //         r = q;
                //     }else{
                //         p = q+1;
                //     }
                // }
                // idx = p;
                while(idx > 0){
                    if(arr1[idx] < arr2[j]) break;
                    idx--;
                }
                // if(idx == 0) {
                
                start = arr1[idx] > arr2[j] ? idx : idx + 1;
                end = i;
                
                rotateArray(arr1, start, end);
                
                int value =  start ;
                arr1[value] = arr2[j];
                
                arr2[j] = temp;
                j--;
            }
        }
    }
    
    public static void rotateArray(long[] array, int i, int j){
        
        while(j>i){
            array[j] = array[j-1];
            j--;
        }
        
        
    }
}
