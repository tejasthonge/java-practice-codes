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

                System.out.println("min no is: ");
                       System.out.println(findMinNumber(arr));


        }

        public static int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        return minNumber;
    }
}
                                  
