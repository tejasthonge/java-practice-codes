

//using rec


import java.util.*;
class Rec{

	int binarySearch(int arr[] ,int search ,int start,int end){

		if(start>end)
			return -1;

		else{
			int mid= (end+start)/2;

			if(arr[mid] == search)
				return mid;
			if(search > arr[mid]){
				start = mid+1;
				return binarySearch(arr,search,start,end);
			}
			else{
				end = mid -1;
				return binarySearch(arr,search,start,end);
			}
		}

		
	
	
	}

	public static void main(String[] boss){

		int arr[] = new int[]{4,7,11,24,25,57,75,87};

		for(int i = 0;i<arr.length;i++){
		
			System.out.print(arr[i] +  ",");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the element that you want find :");
	
		int E= sc.nextInt();

		int s =0;
		int e =arr.length-1;
		Rec obj = new Rec();

		int ret = obj.binarySearch(arr,E,s,e);
		if(ret>=0)
			System.out.println("elemet is at index : " +ret);
		else
			System.out.println("elemnt is not found");
	}

}
