There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

 

Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.
Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.
  
  
  
  
//   Optimal --> Time - O(n), Space - O(1)
  
  class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0, rightSum = 0;
        int maxValue = Integer.MIN_VALUE;
        
        for(int i=0;i<k;i++){
            leftSum += cardPoints[i];
        }
        maxValue = Math.max(maxValue, leftSum);
        
        for(int i=0;i<k;i++){
            leftSum -= cardPoints[k-i-1];
            rightSum += cardPoints[n-i-1];
            
            maxValue = Math.max(maxValue, leftSum + rightSum);
        }
        return maxValue;
        

//         int n = array.length;
//         int i = 0, j = array.length-1;
//         int sum = 0, maxIdx = Integer.MIN_VALUE;
        
//         if ( k == n) {
//             for(int l : array){
//                 sum += l;
//             }
//             return sum;
//         }
        
//         while(k-- > 0 ){
//             if(array[i] < array[j]){
//                 sum += array[j--];
//                 // j--;
//                 // if((n-1-j) + i > k) i--;
                
//             }else if(array[i] > array[j]){
//                 sum += array[i++];
//                 // i++;
//                 // if((n-1-j) + i > k) j++;
                
//             }else{
//                 sum += array[i];
//                 i++;
//                 j--;
//                 // if((n-1-j) + i > k){
//                     if(array[i] < array[j]){
//                         i--;
//                     }else if(array[i] > array[j]){
//                         j++;
//                     }
//                 }
            // }
        // }
        
        // return sum;
        
        
        
        
        
//         int sum1 = 0, sum2 = 0;
//         int n = cardPoints.length;
        
//         for(int i=0; i<k; i++){
//             sum1 += cardPoints[i];
//             sum2 += cardPoints[n-i-1];
//         }
//         if(k == n) return sum1;
        
//         int maxValue = Math.max(sum1, sum2);
//         int i = k-1, j = n-k;
       
//         while(i > 0 && j < n-1){
//             maxValue = Math.max(maxValue, Math.max(sum1, sum2));
            
//             sum1 -= cardPoints[i--];
//             sum2 -= cardPoints[j++];
                
//            int curr1 = sum1 - cardPoints[i] + sum2 - cardPoints[j];
//            int curr2 = sum2 - cardPoints[j] + sum1 - cardPoints[i];
            
//             maxValue = Math.max(maxValue , Math.max(curr1, curr2));
//             }
//         return maxValue;
        }
    }
