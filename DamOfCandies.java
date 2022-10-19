Geek wants to make a special space for candies on his bookshelf. Currently, it has N books, each of whose height is represented by the array height[] and has unit width.
Help him select 2 books such that he can store maximum candies between them by removing all the other books from between the selected books. The task is to find out the area between two books that can hold the maximum candies without changing the original position of selected books. 

Example 1:

Input: N = 3, height[] = {1, 3, 4}
Output: 1
Explanation:
1. Area between book of height 1 and book of 
height 3 is 0 as there is no space between 
them.
2. Area between book of height 1 and book of 
height 4 is 1 by removing book of height 3.
3. Area between book of height 3 and book of 
height 4 is 0 as there is no space between them.

Example 2:

Input: N = 6, height[] = {2, 1, 3, 4, 6, 5}
Output: 8
Explanation: Remove the 4 books in the middle 
creating length = 4 for the candy dam. Height 
for dam will be min(2,5) = 2. 
Area between book of height 2 and book 
of height 5 is 2 x 4 = 8.
  
  
  
  
  class Solution 
{ 
	static int maxCandy(int height[], int n) 
	{ 
	    int maxValue = 0;
	    
	   // Optimal approach --> time - O(n), space - O(1)
	   
	   int i=0, j = n-1;
	   
	   while(i<j){
	       if(height[i] < height[j]){
	           maxValue = Math.max(maxValue, (j-i-1)*(height[i]));
	           i++;
	       }else if(height[j] < height[i]){
	           maxValue = Math.max(maxValue, (j-i-1)*(height[j]));
	           j--;
	       }else{
	           maxValue = Math.max(maxValue, (j-i-1)*(height[i]));
	           i++;
	           j--;
	       }
	   }
	   
	    
	    
	   // Brute force approach --> time - O(n2), space - O(1)
	   
	   
	   //for(int i=0;i<n;i++){
	   //    for(int j=0;j<n;j++){
	   //        maxValue = Math.max(maxValue, (j-i-1)*(Math.min(height[i], height[j])));
	   //    }
	   //}
	   return maxValue;
	}
}
