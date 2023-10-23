//27/04/2023



class c1{

	public static void main(String[] boss){
	
		int arr[][] = new int[2][3];    //this 2 is represent row of 2 d array or 3 is stand for no of collam 
						//it is same as matrex row X collams = [][]
						//the size of array is stand of no of rows in array == arr.length
						//withot or ematy  collam size are not gives error 
						//in heap section new array boject are created but array is class
						//two dimention array is combinetion of multipal single dimetion arays
						//in heap arr name addres is store  that aar tands for [][] d array 
						//in bettewen arr name objet two 1d array addres is store 
						//and each single ellemet addres of data are store 
						//theis is callad as double pointer 
						//
						// in java stack arr of addres are store and they looking or point to heap new 1d arr object is arr[i] or arr[j]
						//and above proses is happan
						//
						//that mens in 2d array no row = no new 1d array
						//in this example 2 row that mens two 1d array are created in heap section
				

// their is multiple method to add elemt one is bellow type other is by using nested for loop		

		arr[0][0] = 70;
                arr[0][1] = 80;
                arr[0][2] = 90;


		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;
		
		System.out.print(arr[0][0] + " ");
		System.out.print(arr[0][1] + " ");
		System.out.print(arr[0][2] + " ");	
	
		System.out.println();

		System.out.print(arr[1][0] + " ");
		System.out.print(arr[1][1] + " ");
		System.out.print(arr[1][2] + " ");
	
	}





}
