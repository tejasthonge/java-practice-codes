//bianary search
//	--only on  sorted array

// using loop -Binary search



import java.util.*;
class loop{

	int bianarySerach(int[] arr,int search){
	
		int n = arr.length;	
		int counter =0;		
		int start = 0;
		int end = n-1;

		while(start<=end){

			counter++;
			int mid = (end +start)/2;
			if(arr[mid]==search){
				System.out.println(counter);
				return mid;
			}
			if(arr[mid] > search){
				end = mid-1;
			}
			else{
				start = mid +1;
			}
		
			
		}
		System.out.println(counter);
		return -1;	
	}

	public static void main(String[] boss){
	
		int arr[] = new int[]{4,7,11,24,25,57,75,87};

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the element that you want find : ");
		int E = sc.nextInt();

		loop obj = new loop();
		int ret = obj.bianarySerach(arr,E);

		if(ret >=0 )
			System.out.println("element "+ E+ " fount at index "+ ret);	
		else
			System.out.println("element is not found ");
	
	}

}
