Given an integer N, the task is to find the minimum cost to merge all the numbers from 1 to N 
where the cost of merging two set of numbers A and B is equal to the product of the product of the numbers in the respective sets.

Examples:  

Input: N = 4 
Output: 32
Merging {1} and {2} costs 1 * 2 = 2 
Merging {1, 2} and {3} costs 2 * 3 = 6 
Merge{1, 2, 3} and {4} costs 6 * 4 = 24 
Hence, the minimal cost is 2 + 6 + 24 = 32

Input: N = 2 
Output: 2 
  
  
  
   // Optimal approach --> time - O(n), space - O(n)
    public static int minCostToMerge(int n){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        int product = 0;

        while(queue.size() > 1){
            int val1 = queue.poll();
            int val2 = queue.poll();

            int temp = val1 * val2;
            product += temp;
            queue.offer(temp);
        }

        return product;

    }
