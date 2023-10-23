//given an array of size N retur count of pairse(i,j);
//with Arr[j]+Arr[i]==k
//k=10
//N=10
class ArrayDemo{


	public static void main(String[] boss){
	int k = 10;
	int count =0;
	int arr[] =  new int[]{3,5,2,1,-3,7,8,15,6,1,13};	
	int N=  arr.length;
	for (int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length;j++){

		if(arr[i]+arr[j]==k){
			count++;
		}
		}
	}
	System.out.println("count : "+count);
	
	}

}
