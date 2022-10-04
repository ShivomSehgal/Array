Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
  
  
  
  
  
  
  
  
  
  
  
  class Solution
{
    public static void sort012(int arr[], int n)
    {
        // Time - O(n), Space - O(1)
        int counter0 = 0, counter1 = 0, counter2 = 0;
        // int k =0;
        for(int i=0;i<n; i++){
            if(arr[i] == 0) counter0++;
            if(arr[i] == 1) counter1++;
            if(arr[i] == 2) counter2++;
        }
        int k = 0;
        
        while(counter0 !=0 || counter1 != 0 || counter2 != 0 ){
           
            if(counter0 != 0 && k < n){
                
                arr[k++] = 0;
                counter0--;
                
            }else if(counter1 !=0  && k < n){
            
                arr[k++] = 1;
                counter1--;
                
            }else if(counter2 != 0  && k < n){
                
                arr[k++] = 2;
                counter2--;
                
            }
        }
    }
}
