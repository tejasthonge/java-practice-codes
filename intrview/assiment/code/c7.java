import java.util.*;


class c3{


        public static void main(String[] boss){

                System.out.println("enter the size of an array");
                Scanner sc = new Scanner(System.in);
                int length = sc.nextInt();
                int arr[] = new int[length];


                for(int i =0 ;i<arr.length; i++){
                        System.out.println("enter the " + i +" no index element");
                  arr[i]= sc.nextInt();
                }

		int sum =0;
                for(int i=0;i<arr.length;i++){
		
		 sum = sum+arr[i];
		
		}
		System.out.println("the sum of all  element is :"+sum);


        }


}

