Move all negative numbers to beginning and positive to end with constant extra space
Difficulty Level : Easy
Last Updated : 14 Jun, 2022
Read
Discuss

An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5

Note: Order of elements is not important here.
  
  
  
  
  
  import java.util.*;

public class moveNegative {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        moveElements(array);

        System.out.println(Arrays.toString(array));
    }

    public static void moveElements(int[] array){
        int len = array.length;

        int i = 0, j = len - 1;

        while(i<j){
            if(array[i] < 0){
                i++;
            }else if(array[j] > 0){
                j--;
            }else{
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}
