
//given of an array of size N and count the element having atlest one  greatest in it self
//Arr : [2,5,1,4,8,0,8,1,3,8];
//N= 10
//output: 7


class ArrayDemo{


	public static void main(String[] boss){
	
		int count =0;
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int maxNum = Integer.MIN_VALUE;
		int N= arr.length;
		for(int i= 0 ;i<N;i++){
			if(maxNum<arr[i]){
			 maxNum = arr[i];
			}
						
		}
		for(int i = 0;i<N;i++){
			
			if(arr[i] == maxNum){
				count++;
			}
		}
		int ret = N-count;
		System.out.println("the element count having atlest one element greter itself : "+ret);
		
		}	
		
		
	}

