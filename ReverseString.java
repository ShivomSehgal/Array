You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof




class Reverse
{
    
    public static String reverseWord(String str)
    {
        int len = str.length();
        
        // Optimal approach : Time - O(|S|) , Space - O(1)
        
        int layer = 0;
        for(int i=0; i<len/2; i++){
            int j = len - i - 1;
            
            String temp = str.substring(i+1,j);
            temp = str.substring(j, len-layer) + temp;
            temp += str.substring(layer,i+1);
            
            String prevL = str.substring(0,layer);
            String prevR = str.substring(len-layer, len);
            
            layer++;
            str =prevL +  temp + prevR;
        }
        
        return str;
        
        // Brute force approach : Time -O(|S|) , Space - O(|S|)
        
        char[] array = str.toCharArray();
        
        for(int i=0; i<len/2 ; i++){
            int j = len - i - 1;
            
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            
        }
        
        return String.valueOf(array);
    }
}
