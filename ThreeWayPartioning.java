Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.


Example 1:

Input: 
n = 5
A[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 1
Explanation: One possible arrangement is:
{1, 2, 3, 3, 4}. If you return a valid
arrangement, output will be 1.


Example 2:

Input: 
n = 3 
A[] = {1, 2, 3}
[a, b] = [1, 3]
Output: 1
Explanation: One possible arrangement 
is: {1, 2, 3}. If you return a valid
arrangement, output will be 1.

  
  
  class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        
        // Optimal Solution --> Time - O(n), Space - O(1)
        int n = array.length;
        int c1 = 0;
        
        for(int i=0;i<n;i++){
            if(array[i] < a){
                int temp = array[c1];
                array[c1++] = array[i];
                array[i] = temp;
            }
        }
        
       for(int i=0;i<n;i++){
            if(array[i] >= a && array[i] <=b){
                int temp = array[c1];
                array[c1++] = array[i];
                array[i] = temp;
            }
        }
        
        for(int i=0;i<n;i++){
            if(array[i] > b){
                int temp = array[c1];
                array[c1++] = array[i];
                array[i] = temp;
            }
        }
        
        
        // Brute force solution --> Time - O(n), Space - O(1)
        // List<Integer> A = new ArrayList<>();
        // List<Integer> AB = new ArrayList<>();
        // List<Integer> B = new ArrayList<>();
        
        // for(int i : array){
        //     if(i < a) {
        //         A.add(i);
        //     }else if(i>=a && i <= b){
        //         AB.add(i);
        //     }else if (i > b){
        //         B.add(i);
        //     }
        // }
        
        //     int i=0;
           
        //     while(A.size() > 0){
        //       array[i++] =  A.remove(0);
        //     }
           
        //     while(AB.size() > 0){
        //       array[i++] =  AB.remove(0);
        //     }
            
        //     while(B.size() > 0){
        //       array[i++] =  B.remove(0);
        //     }
            
            // for(int k : array){
            //     System.out.print(k + " ");
            // }
        }
    }
