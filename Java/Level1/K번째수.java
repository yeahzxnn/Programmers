import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            //Arrays.copyOfRange:배열을 범위를 잘라서 복사
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            //해당배열 sort로 정렬,default:오름차순
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
