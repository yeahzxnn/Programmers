//풀이 1.
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cnt = 0;
        char ch = ' ';
        
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch=='p' || ch=='P'){
                cnt++;
            } else if(ch=='Y' || ch=='y'){
                cnt--;
            }   
        }
        if(cnt!=0){
            return false;
        }
        return true;
    }
}

//풀이 2. 다른 사람의 풀이
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}

