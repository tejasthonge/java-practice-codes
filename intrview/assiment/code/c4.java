import java.util.*;


class c1{


        public static void main(String[] boss){

		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size");
		int len = sc.nextInt();
	
                int arr[] = new int[len];

               
                for(int i =0 ;i<arr.length; i++){
                        System.out.println("enter the " + i +" no index element");
                  arr[i]= sc.nextInt();
                }

 
 		System.out.println("array element theat you enter as bellow");
                for(int i =0; i<arr.length;i++){
			if (arr[i]%2==0){
                        System.out.println(arr[i]);}
                }


        }


}
