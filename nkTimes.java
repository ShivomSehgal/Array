Given an array of size n, find all elements in array that appear more than n/k times. 
For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4,
then the output should be [2, 3]. Note that size of array is 8 (or n = 8), 
so we need to find all elements that appear more than 2 (or 8/4) times.
There are two elements that appear more than two times, 2 and 3.

class Solution{
    public static List<Integer> nkTimesCounter(int[] array, int n, int k){
        
        // Optimised approach --> Time - O(nlogn), Space - O(1)
        
        // Use sorting and calculate the first and last index of each element and if its 
        // greater than n/k
        // use condition if(arr[i] != arr[i+1]) to get the last element index
        
        // Brute force approach --> time - O(n), space - O(n)
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i: array){
            if(map.containsKey(i)){
                int value = map.get(i);
                value++;
                map.put(i,value);
            }else{
                map.put(i,1);
            }
        }
        int target = n/k;
        
        for(int i : array){
            if(map.get(i) > target) {
                if(result.size() == 0 || result.contains(i)) continue;
                else result.add(i);
            }
        }
        return result;
    }
}
