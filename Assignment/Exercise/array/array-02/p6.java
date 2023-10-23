


/*
Program 6
WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5 

   */

import java.util.*;
class Arr{

        public static void main(String[] boss){
                Scanner sc = new Scanner(System.in);
                System.out.println("enteer the size of an array");
                int N= sc.nextInt();
                int arr[]= new int[N];
                int maxNo =Integer.MIN_VALUE;
                System.out.println("enter the element :");
                for(int i =0;i<N;i++){
                        arr[i] =sc.nextInt();
                        if(arr[i]>maxNo)
                                maxNo= arr[i];
                }

                System.out.println("the minimum value is : "+maxNo);

        }

}
