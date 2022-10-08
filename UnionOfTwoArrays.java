Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
  
  
  
  
  class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> union = new TreeSet<>();
        
        for(int i=0;i<a.length;i++){
            if(union.contains(a[i])) continue;
            
            union.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            if(union.contains(b[i])) continue;
            
            union.add(b[i]);
        }
        
        return union.size();
    }
}
