Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

Example 2:

Input:
r = 3, c = 4  
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output: 
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.
  
  
  
  
  class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
       
        int layer = 0, dir = 0;
        int row = 0, col = 0;
        
       res.add(matrix[row][col]);
       
        for(int i=1;i<r*c;i++){
            switch(dir){
            case 0 :
                if(col == c - layer -1){
                    row++;
                    dir = 1;
                }else{
                    col++;
                }
                break;
                
            case 1 :
                if(row == r - layer -1){
                    col--;
                    dir = 2;
                }else{
                    row++;
                }
                break;
                
            case 2 :
            if(col ==  layer ){
                row--;
                dir = 3;
            }else{
                col--;
            }
            break;
            
            case 3 :
                if(row == layer + 1){
                    col++;
                    dir = 0;
                    layer++;
                }else{
                    row--;
                }
                break;
                }
                res.add(matrix[row][col]);
        }
        return res;
    }
}
