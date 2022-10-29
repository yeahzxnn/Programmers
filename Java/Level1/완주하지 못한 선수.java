//Sort이용
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //두 배열이 다를 때까지 찾기
        for(int i=0; i<participant.length; i++) {
            if(i == completion.length) {
                answer = participant[i];
                break;
            }
            
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}

//HaspMap
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
