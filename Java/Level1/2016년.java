//배열로 푸는 방법
class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for(int i=0; i<a-1; i++){
            date += month[i];
            
        }
        date += b-1;
        return day[date%7];
    }
}

//DateForamt
public String solution(int a, int b) {
    String answer = "";
    Calendar cal = Calendar.getInstance();
    cal.set(2016, a-1, b);
    Date date = cal.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
          
    answer = sdf.format(date).toUpperCase();
    return answer;
}

//Calendar 클래스 활용해서 더 간결하게 푸는 코드
public String getDayName(int month, int day) {
    Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
    return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
}



