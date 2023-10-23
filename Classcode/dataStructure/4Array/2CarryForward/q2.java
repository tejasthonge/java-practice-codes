

/*
 Given an inter  of size N
 Build an Array Left_Max[]  of size N
 Left_Max of i contans the maximum for index 0 to i

arr:[-3,6,2,4,5,2,8,-9,3,1]
N=10;
op: Left_Max:[-3,6,6,6,6,6,8,8,8,8]

 */

//btuteforce apparoch
class LeftMax{

	public static void main(String[] boss){
	int itr =0;
	int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
	int N= arr.length;
	int[] Left_Max = new int[N];

	//we chek left side elemet is gereter than that of rigth side of i
	//
	//i=0
	//gretest element is itself

	Left_Max[0]=arr[0];
	int max_no = Integer.MIN_VALUE;
	Left_Max[0] =arr[0];
	max_no=arr[0];
	for(int i =1 ; i<N; i++){		
		itr++;
		if(arr[i]>max_no){
			max_no = arr[i];
			Left_Max[i] = max_no;
		}
		else{
		
			Left_Max[i] = max_no;
		}
		
	}		
	
	

	for(int i= 0 ;i<N;i++){
		itr++;
		System.out.print(Left_Max[i] + " ");
	}
	System.out.println("no of itreation: "+itr);
	}

}
