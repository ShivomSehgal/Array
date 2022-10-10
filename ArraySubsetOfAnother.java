Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 
 

Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 2:

Input:
a1[] = {1, 2, 3, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 3:

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]





  public String isSubset( long a1[], long a2[], long n, long m) {
        
        
        // Optimal approach --> Time - O(n), Space - O(n) ~ m is a subset of n in height
        if(n < m) return "No";
        
        Map<Long,Long> map = new HashMap<>();
        
        for(long i : a1){
            if(map.containsKey(i)){
                long value = map.get(i) + 1;
                map.put(i,value);
            }else{
                map.put(i,(long)1);
            }
        }
        
        for(long i : a2){
            if(!map.containsKey(i) || map.get(i) == 0){
                return "No";
            }else{
                map.put(i,map.get(i)-1);
            }
        }
        
        return "Yes";
        
        
        // Brute force --> Time - O(n1logn1 + n2logn2 + min(n1,n2)), Space - O(1)
        
        // if(n < m) return "No";
        
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        
        // int i=0,j=0;
        
        // while(j<a2.length){
        //     if(a1[i] < a2[j]){
        //         i++;
        //     }else if(a1[i] == a2[j]){
        //         i++;
        //         j++;
        //     }else{
        //         return "No";
        //     }
        // }
        // return "Yes";
    }
