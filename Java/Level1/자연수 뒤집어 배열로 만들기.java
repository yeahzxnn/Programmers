import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int a = 0;
        long num = n;
        
        while(n>0){
            a++;
            n = n/10;
        }

        answer = new int[a];

        for(int i=0; i<a; i++){
            answer[i] = (int)(num%10);
            num = num/10;
        }
        return answer;
    }
}
