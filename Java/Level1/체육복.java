import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int reserve_arr[] = new int[reserve.length];
        int lost_arr[] = new int[lost.length];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    reserve_arr[j]=1;
                    lost_arr[i]=1;
                    answer+=1;
                    break;
                }
            }
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                int gap = Math.abs(lost[i]-reserve[j]);
                if(gap==1&&reserve_arr[j]==0&&lost_arr[i]==0){
                    System.out.println(lost[i]+":"+reserve[j]);
                    answer+=1;
                    lost_arr[i]=1;
                    reserve_arr[j]=1;
                    break;
                }
            }
        }
        return answer;
    }
}
