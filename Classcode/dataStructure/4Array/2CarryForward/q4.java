//google
//
//3.
//given an Array (Charator arry)
//-lower case
//return the count of pair(i,j) such that
//	a) i < j
//	b)arr[i] = 'a'
//	  arr[j] = 'g'
//
//	arr: [a,b,e,g,a,g]
//
//	op: 3
// TC O(N)
//
//optimize way

class google{

	public static void main(String[] boss){
	
		char arr[] = new char[]{'a','a','b','a','e','g','a','g'};
		int count=0;
		int N = arr.length;
		int sum =0;
		for(int i=0 ;i<N;i++){
			if(arr[i]=='a'){
				count++;
				
			}
			if(i<N-1){
			if(arr[i+1]=='g' ){
			sum = sum+count;
			}
			}
			

		}
		System.out.println(sum);
	
		
	}


}
