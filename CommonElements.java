Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
  
  
  
  
  
  class Solution
{
    
    boolean binarySearch(int[] array, int target){
        int p = 0, r = array.length-1;
        
        while(p<=r){
            int q = (p+r)/2;
            
            if(array[q] == target) return true;
            else if(array[q] > target){
                r = q-1;
            }else{
                p = q+1;
            }
        }
        return false;
    }
    
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
           ArrayList<Integer> result = new ArrayList<>();
           
// Most optimal approach --> Time - O(min(n1,n2,n3)*(log(max(n1,n2)) + log(max(n2,n3)))), Space - O(1)

            int len  = Math.min(n1, Math.min(n2,n3));
            
            if(len == n1){
                for(int i=0;i<len;i++){
                    boolean b1 = binarySearch(B,A[i]);
                    boolean b2 = binarySearch(C,A[i]);
                    
                    if(b1 && b2){
                        if(!result.contains(A[i])) result.add(A[i]);
                    } 
                }
            }else  if(len == n2){
                for(int i=0;i<len;i++){
                    boolean b1 = binarySearch(A,B[i]);
                    boolean b2 = binarySearch(C,B[i]);
                    
                    if(b1 && b2){
                        if(!result.contains(B[i])) result.add(B[i]);}
                }
            }else{
                for(int i=0;i<len;i++){
                    boolean b1 = binarySearch(B,C[i]);
                    boolean b2 = binarySearch(A,C[i]);
                    
                    if(b1 && b2){
                        if(!result.contains(C[i])) result.add(C[i]);
                    } 
                }
            }
        //   for(int i=1;i<result.size();i++){
        //       if(result.get(i-1) == result.get(i)) result.remove(i);
        //   }
            return result;

        
    //     // Optimal approach --> Time - O(n1 + n2 + n3), Space - O(n1 + n2 + n3)
        // merge them  or use three hashsets
    //     // int[] array = new int[n1+n2+n3];
        
    //   int[] temp = merge(A,B);
    // //   System.out.println(Arrays.toString(temp));
    //   int[] array = merge(C,temp);
    // //   System.out.println(Arrays.toString(array));
       
    //   for(int i=1;i<array.length-1;i++){
    //       if(array[i-1] == array[i] && 
    //       array[i] == array[i+1]){
    //           result.add(array[i]);
    //       }
    //   }
    //   return result;
        
        // Brute force --> Time - O(nlogn), Space - O(n)  ~ n = n1 + n2 + n3
        
        //  List<Integer> array = new ArrayList<>();
        
        // for(int i : A) array.add(i);
        // for(int i : B) array.add(i);
        // for(int i : C) array.add(i);
        
        // Collections.sort(array);
        
    
        
        // for(int i=1;i<array.size()-1;i++){
        //     if(array.get(i-1) == array.get(i) 
        //     && array.get(i) == array.get(i+1)) result.add(array.get(i));
            
        // }
        // // if(Collections.frequency(result.get(0)) == result.size()) return 
        // // new ArrayList<>(Arrays.asList(result.get(0)));
        // return result;
    }
    
    // public int[] merge(int[] a, int[] b){
        
    //     int len1 = a.length-1, len2 = b.length-1;
    //     int s1 = 0, s2 = 0;
    //     int k =0;
    //     int[] res = new int[len1 + len2 + 2];
        
    //     while(s1 <= len1 && s2 <= len2){
    //         if(a[s1] < b[s2]){
    //             res[k++] = a[s1++];
    //         }else if(a[s1] > b[s2]){
    //             res[k++] = b[s2++];
    //         }else{
    //             res[k++] = a[s1++];
    //             res[k++] = b[s2++];
    //         }
    //     }
    //     if(s1 <= len1){
    //     while(s1 <= len1){
    //         res[k++] = a[s1++];
    //     }
    //     }
    //     if(s2 <= len2){
    //      while(s2 <= len2){
    //         res[k++] = a[s2++];
    //     }
    //     }
    //     return res;
    // }
}
