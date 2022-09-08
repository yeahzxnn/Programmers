class Solution {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        
        if(sqrt==sqrt.intValue()){
            return (long)Math.pow(sqrt+1,2);
        }else return -1;
    }
}

//double형으로 바꾸지 않고도 할 수 있는 방법
class Solution {
    public long solution(long n) {
        if(Math.pow((int)Math.sqrt(n),2) == n) {
            return (long) Math.pow(Math.sqrt(n)+1,2);
        }
        return -1;
    }
}
