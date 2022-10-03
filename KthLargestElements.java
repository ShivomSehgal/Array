 Given an array arr[] and an integer K where K is smaller than size of array, 
the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.



class Solution{
    // public static int kthSmallest(int[] arr, int l, int r, int k) 
    // { 
    //     PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
    //     for(int i=0;i<arr.length;i++){
    //         if(queue.size() > k){
    //             queue.poll();
    //         }
    //         queue.offer(arr[i]);
    //     }
    //     if(k == arr.length) return queue.peek();
    //     queue.poll();
        
    //     // while(!queue.isEmpty()){
    //     //     System.out.println(queue.peek());
    //     //     queue.poll();
    //     // }
    //     // return -1;
        
    //     return queue.peek();
        
    // } 
    
    //  public static int kthSmallest(int[] arr, int p, int r, int k){
    //      Arrays.sort(arr);
         
    //      return arr[k-1];
    //  }
    
    
    // q :                    3  4 7 15 
    
    public static int kthSmallest(int[] arr, int p, int r, int k){
        // System.out.println(p +" "+r);
        if(p>r) return -1;
        
        int q = partion(arr, p,r);
        
        if(q +1 == k) return arr[q];
        
        if(q +1 < k) {
            return kthSmallest(arr, q+1, r, k);
        }
        else {
            return kthSmallest(arr, p, q-1, k);
        }
    }
    
    
    public static int partion(int[] arr, int l, int r) 
    { 
        // int n = arr.length;
        int j=l-1;
        int pivot = arr[r];
        
        for(int i=l;i<r;i++){
            if(arr[i] < pivot){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j+1];
        arr[j+1]=pivot;
        arr[r]=temp;
        return j+1;
    } 
}
