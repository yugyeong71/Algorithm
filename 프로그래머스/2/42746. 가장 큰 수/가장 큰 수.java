import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] numbersString = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            numbersString[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(numbersString, (a, b) -> (b + a).compareTo(a + b));
        
        if (numbersString[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String num : numbersString) {
            sb.append(num);
        }
        
        return sb.toString();
    }
}