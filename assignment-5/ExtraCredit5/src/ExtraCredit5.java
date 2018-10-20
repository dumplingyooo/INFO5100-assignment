import java.util.ArrayList;
import java.util.List;

public class ExtraCredit5 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //write your code here
        List<Integer> end = new ArrayList<>();
        
        int countRow = matrix.length;
        int countLine = matrix[0].length;
        int left = 0;
        int right = countLine - 1;
        int top = 0;
        int bot = countRow - 1;
        
        if(matrix == null || countRow == 0) {
            return end;
        }
        else {
            while(left < countRow && top < countLine) {
            	//left->right
                for(int i = left; i <= right; i++) {
                	end.add(matrix[top][i]);
                }
            	//top++;
            	
                for(int j = top + 1; j <= bot - 1; j++) {
                	end.add(matrix[j][right]);
                }
                //right--;
                
                if(top != bot) {
                	for(int i = right; i >= left; i--) {
                		end.add(matrix[bot][i]);
                	}
                }
                //bot--;
                
                if(left != right) {
                	for(int j = bot -1; j >= top + 1; j--) {
                		end.add(matrix[j][left]);
                	}
                }
                top++;
                right--;
                left++;
                bot--;
                
            }
            return end;
        }
    }
}
