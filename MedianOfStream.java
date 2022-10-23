Given an input stream of N integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.

Example 1:

Input:
N = 4
X[] = 5,15,1,3
Output:
5
10
5
4
Explanation:Flow in stream : 5, 15, 1, 3 
5 goes to stream --> median 5 (5) 
15 goes to stream --> median 10 (5,15) 
1 goes to stream --> median 5 (5,15,1) 
3 goes to stream --> median 4 (5,15,1 3) 
 

Example 2:

Input:
N = 3
X[] = 5,10,15
Output:
5
7.5
10
Explanation:Flow in stream : 5, 10, 15
5 goes to stream --> median 5 (5) 
10 goes to stream --> median 7.5 (5,10) 
15 goes to stream --> median 10 (5,10,15) 
  
  
  
  
  class Solution
{
    static PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
   static PriorityQueue<Integer> large = new PriorityQueue<>();
   static boolean isOdd = false;
    
    public static void insertHeap(int x)
    {
        if(isOdd){
            small.offer(x);
            large.offer(small.poll());
        }else{
            large.offer(x);
            small.offer(large.poll());
        }
        isOdd = !isOdd;
    }
    
    
    public static void balanceHeaps()
    {
       // add your code here
    }
    
    
    public static double getMedian()
    {
        double temp = 0;
        
        if(isOdd){
            temp = small.peek();
        }else{
            temp = (small.peek() + large.peek())/2;
        }
        return temp;
    }
    
