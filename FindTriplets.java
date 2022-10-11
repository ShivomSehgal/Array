Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.
Example 2:

Input:
n = 5, X = 10
arr[] = [1 2 4 3 6]
Output:
1
Explanation:
The triplet {1, 3, 6} in 
the array sums up to 10.
  
  
  
  
  
  
  class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int a[], int n, int X) { 
    
    //   Brute force approach  --> Time - O(n2), Space - O(1)
    
         Arrays.sort(a);
         
        //  int i=0, j = n-1;
         
         for(int k=0;k<n-2;k++){
             int i=k+1, j=n-1;
             
             while(i<j){
                  if((a[k] + a[i] + a[j]) == X) return true;
                  
                  if(a[i] + a[j] > X - a[k]) j--;
                  else i++;
             }
         }
         
        //  while(i<j-1){
             
        //     //  int sum = a[i] + a[j];
        //     //  int target = X - sum;
             
        //      for(int k=i+1;k<j;k++){
        //          if((a[k] + a[i] + a[j]) == X) return true;
        //         //  System.out.print(a[k] + a[i] + a[j] + "    ");
        //      }
        //     //  System.out.println();
        //      j--;
        //  }
         
        //   i=0;
        //   j = n-1;
         
        //  while(i<j-1){
             
        //     //  int sum = a[i] + a[j];
        //     //  int target = X - sum;
             
             
        //          if((a[k] + a[i] + a[j]) == X) return true;
        //         //  System.out.print(a[k] + a[i] + a[j] + "    ");
        //      }
        //     //  System.out.println();
        //      i++;
        //  }
        return false;
    }
}
