//방법 1.
import java.util.*;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] s = str.toCharArray();
        Arrays.sort(s);
        String sb = new StringBuilder(new String(s)).reverse().toString();
        return Long.parseLong(sb);
    }
}

//방법 2.
public long solution2(long n) {
    String[] list = String.valueOf(n).split("");
    Arrays.sort(list,Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    for(String s:list) {
    	sb.append(s);
    }
    return Long.parseLong(sb.toString());
}
