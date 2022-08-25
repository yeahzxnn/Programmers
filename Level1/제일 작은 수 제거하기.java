//1번 방법
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1)
            return new int[]{-1};
        
        int min = Integer.MAX_VALUE;    
        for(int a:arr){
            if(min>a)
                min = a;
        }
        
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int a:arr){
            if(min!=a)
                newArr[index++]=a;
        }
        return newArr;
    }
}

ㄴ
//2번 방법
public int[] solution(int[] arr) {
	if(arr.length <= 1) return new int[] {-1};
	
	int min = Integer.MAX_VALUE;
	List<Integer> list = new ArrayList<Integer>();
	for(int i=0; i<arr.length; i++) {
		list.add(arr[i]);
		if(min > arr[i]) min = arr[i];
	}
	list.remove(list.indexOf(min));
	int[] newArr = new int[list.size()];
	for(int i=0; i<newArr.length; i++) newArr[i] = list.get(i);
	
	return newArr;
}


//3번방법
public int[] solution(int[] arr) {		
	if(arr.length == 1) return new int[] {-1};
    
	int min = IntStream.of(arr).min().getAsInt();
	return IntStream.of(arr).filter(i -> i != min).toArray();
}



