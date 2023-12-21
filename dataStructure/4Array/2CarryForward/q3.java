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


class google{

	public static void main(String[] boss){
	
		char arr[] = new char[]{'a','a','b','e','g','a','g'};
		int count=0;
		int N = arr.length;

		for(int i=0 ;i<N;i++){
		
			if(arr[i] =='a'){
			for(int j= 0; j<N ;j++){

				if(arr[i]=='a' && arr[j] =='g')
					if(i<j){
					count++;
					}
			}
			}

		}
		System.out.print(count);

	
	}


}
