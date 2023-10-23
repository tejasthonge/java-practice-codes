import java.util.*;



class c5{


        public static void main(String[] boss){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int len = sc.nextInt();
                int arr[] = new int[len];

                
                for(int i =0 ;i<arr.length; i++){
                        System.out.println("enter the " + i +" no index element");
                  arr[i]= sc.nextInt();
                }

                System.out.println("max no is: ");
	               System.out.println(findMaxNumber(arr));


        }

	public static int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}

