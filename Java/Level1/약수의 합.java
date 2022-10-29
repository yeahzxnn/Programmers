//프로그래머스 자바 마지막 강의-알고리즘 풀기
class Solution {
  public int solution(int n) {
      int answer = 0;
      for(int i=1; i<=n; i++){
          if(n%i==0){
              answer += i;
          }
      }
      return answer;
  }
}
