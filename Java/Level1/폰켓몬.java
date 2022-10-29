import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
        
        //배열 중복 제거
        for(int i=1; i<nums.length; i++)
            if(!list.contains(nums[i]))
                list.add(nums[i]);
        
        answer = (list.size()<nums.length/2)?list.size() : nums.length/2;
        return answer;
    }
}
