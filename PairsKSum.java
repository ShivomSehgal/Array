Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, K = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.
  
  
  
 int getPairsCount(int[] arr, int n, int k) {
        int counter = 0;
        
        // Brute force --> Time - O(n2), Space - O(1)
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i] + arr[j] == k) counter++;
        //     }
        // }
        
//         Time - O(n), Space - O(n)
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
                List<Integer> list = map.get(arr[i]);
                if(list == null) list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            }
        
        
        for(int i=0;i<n;i++){
            int target = k - arr[i];
            
            if(map.containsKey(target)){
                for(int value : map.get(target)){
                    if(value > i) counter++;
                }
            }
        }
        
        // Arrays.sort(arr);
        
        // int i=0, j = n-1;
        // int counter = 0;
        // while(i<j){
        //     int sum = arr[i] + arr[j];
            
        //     if(sum == k) {
        //         counter++;
        //         i++;
        //         // j--;
        //     }
        //     else if (sum < k) i++;
        //     else j--;
        // }
        return counter;
    }
