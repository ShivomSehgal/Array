Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.


Example 1:

Input: n = 6 
arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
dep[] = {0910, 1200, 1120, 1130, 1900, 2000}
Output: 3
Explanation: 
Minimum 3 platforms are required to 
safely arrive and depart all trains.
Example 2:

Input: n = 3
arr[] = {0900, 1100, 1235}
dep[] = {1000, 1200, 1240}
Output: 1
Explanation: Only 1 platform is required to 
safely manage the arrival and departure 
of all trains. 
  
  
  
  // Simply just take all the values in a 2D array and sort them based on their arrival times.
  // Now, use a priority queue and check for the peek with the arrival of the other train,
  // Maximum platforms you can have is length of the array, so platforms = arr.length;
  // now when the line-2 statement contradicts, reduce the platform otherwise simply add the departure time to queue of the current train.
  
  // Time - O(nlogn) --> due to sorting
  // Space - O(n) --> Storing the elements inside an 2D array.
  
  
  class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
         int[][] schedules = new int[n][2];
        
        for(int i=0; i<n; i++){
            schedules[i][0] = arr[i];
            schedules[i][1] = dep[i];
        }
        
        Arrays.sort(schedules, (a,b) -> Integer.compare(a[0], b[0]));
        
        int platforms = n;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(schedules[0][1]);
        
        for(int i=1;i<n;i++){
            if(!q.isEmpty() && q.peek() < schedules[i][0]){
                platforms--;
                q.poll();
                // System.out.println(q.poll());
            }
            q.offer(schedules[i][1]);
        }
        
        return platforms;
        
    }
    
}
