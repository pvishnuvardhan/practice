import java.util.*;


public class Test {

	public static void main(String[] args){
		System.out.println("Hello world");
		int a = 200000;
		int[] array = { 5, 4, 0, 3, 1, 6, 2} ;
		int[] empty = {};
		//System.out.println(count(array));
		System.out.println(solution(array));
		System.out.println(solution(empty));

		
	}
	
	
	public static int solution(int[] A){
		int maxSize = 0;
		int size = 0;
		
		for( int i=0; i<A.length; i++){
			size = getSizeOfSet(A, i);			
			if(size > maxSize){
				maxSize = size;
			}
		}
		return maxSize;
		
	}
	
	private static int getSizeOfSet(int[] a, int i) {
		List<Integer> setArr = new ArrayList<Integer>();
		int index = i;	
		while(true) {
			int element = a[index];			
			
			if(setArr.contains(element)) {
				break;
			}
			setArr.add(element);
			index = element;
		}	
		System.out.println(i+"   "+setArr);
		return setArr.size();		
	}


	public static int count(int[] arr){
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int maxCountNum = -1;
		int maxCount = -1;
		
		for(int num : arr){
				int value = 0;
				if(numMap.containsKey(num)){
					value = numMap.get(num);
					numMap.put(num, value + 1);
				}else {
					numMap.put(num, 1);
				}		
	    }
		
		for(Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
			Integer key = entry.getKey();
			Integer count = entry.getValue();
			System.out.println(key +"  "+count);
			if(count > maxCount) {
				maxCountNum = key;
				maxCount = count;
			}
		}
		return maxCountNum;
	}
	
	
	public static int median(int[] arr){
		Arrays.sort(arr);
		
		int arrayLength = arr.length;
		
		if(arrayLength %2 == 0){
			return arr[arrayLength/2];
		}else{
			return arr[(arrayLength -1)/2];
		}
	}
}
