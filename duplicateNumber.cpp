Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3


  
  // class Solution {
// public:
//     int findDuplicate(vector<int>& nums) {
//         int len = sizeof(nums);
        
//         if(len > 1){
//             int slow = nums[0];
//             int fast = nums[nums[0]];
            
//             while(fast != slow){
//                 fast = nums[nums[fast]];
//                 slow = nums[slow];
//             }
            
//             fast = 0;
            
//             while(fast != slow){
//                 fast = nums[fast];
//                 slow = nums[slow];
//             }
            
//             return slow;
//         }
//         return -1;
//     }
// };

class Solution {
    public:
        int findDuplicate(vector<int>& nums){
            int len = nums.size();
            
            int low = 1;
            int high = len -1;
            int counter ;
            
            while(low <= high){
                int mid = low + (high - low)/2;
                counter = 0;
                
                for(int num : nums){
                    if(num <= mid) ++counter;
                }
                
                if(counter <= mid){
                   low = mid + 1;
                }else{
                     high = mid - 1;
                }
            }
                
             return low;    
                
        }
};


