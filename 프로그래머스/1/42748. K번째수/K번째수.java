import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int i, j, k = 0;
        
        for (int n = 0; n < commands.length; n++) {
            i = commands[n][0];
            j = commands[n][1];
            k = commands[n][2];
            
            int[] rangeArray = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(rangeArray);
            
            answer[n] = rangeArray[k-1];
        }
        
        return answer;
    }
}