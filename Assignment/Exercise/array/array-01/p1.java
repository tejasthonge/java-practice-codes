import java.io.*;

class p1{


	public static void main(String[] boss) throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);

	BufferedReader br = new BufferedReader(isr);

	System.out.println("Enter the size of an array:");

	int size = Integer.parseInt(br.readLine());
	System.out.println("The size of an array: "+size);


	int arr[] = new int[size];

	for (int i = 0 ;i<arr.length ; i++){
	
		System.out.println("Enter the element of index "+i);
	        arr[i]= Integer.parseInt(br.readLine());
	
	
	
	}
	System.out.print("you enter the element is:");
	for (int i =0 ; i<arr.length; i++){
	
		System.out.print(arr[i]);
	
	
	}
	System.out.println();
	
	
	int sum=0;
		
	for(int i = 0 ; i<arr.length; i++){
		if(arr[i]%2!=0){
			sum =sum + arr[i];
		}
	}
	System.out.println("Sum of odd elementis:"+sum);
	}

}
