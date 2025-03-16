class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int index = 0;
        int size = matrix.length * matrix[0].length;
        int[] resultant = new int[size];
        
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                resultant[index] = matrix[top][i];
                index++;
            }
            top++;
            
            for (int i = top; i <= down; i++) {
                resultant[index] = matrix[i][right];
                index++;
            }
            right--;
            
            if (top <= down) { 
                for (int i = right; i >= left; i--) {
                    resultant[index] = matrix[down][i];
                    index++;
                }
                down--;
            }
            
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    resultant[index] = matrix[i][left];
                    index++;
                }
                left++;
            }
        }
        
        for (int i = 0; i < size; i++) {
            answer.add(resultant[i]);
        }
        
        return answer;
    }
}


    
