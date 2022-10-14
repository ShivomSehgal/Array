Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800


// class Solution {
//     static ArrayList<Integer> factorial(int N){
//         BigInteger val = 1;
        
//        for(int i=1;i<=N;i++){
//            val *= i;
//        }
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(val);
//         return list;
//     }
// }


import java.util.*;
import java.math.*;

public class untitled{
    public static void main(String[] args) {
        // int[] array = {1,2,3,-4,-1,4};

        // array = alternateSequence(array);

        // System.out.println(Arrays.toString(array));

        BigInteger val =  new BigInteger("1");
        
        for(int i=2;i<=876;i++){
            val = val.multiply(BigInteger.valueOf(i));
        }

        System.out.println(val);

    }
