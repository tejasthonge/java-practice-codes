

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
	int itr=0;
	int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
	int N= arr.length;
	int[] Left_Max = new int[N];

	//we chek left side elemet is gereter than that of rigth side of i
	//
	//i=0
	//gretest element is itself

	Left_Max[0]=arr[0];
	
	for(int i =0 ; i<N; i++){		

		int n = Integer.MIN_VALUE;
		for(int x = 1 ; x<=i ;x++){
			
			if(arr[x] > n){
				n = arr[x];
				Left_Max[x] = n;
			}
			else{
				Left_Max[x] = n;
		
			}
			itr++;
		}
	
	}

	for(int i= 0 ;i<N;i++){
		System.out.print(Left_Max[i] + " ");
		itr++;
	}

	System.out.println("totale no of itreation : "+itr);
	}
}
