/*
 Program 3
Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26
   */


 import java.util.*;
class ArrayDemo{

        public static void main(String[] boss){

                Scanner sc = new Scanner(System.in);
                System.out.println("enter the size of an array : ");
        int N= sc.nextInt();

        int arr[] = new int[N];
        int ecount=0;
        int ocount=0;
        for(int i=0;i<N;i++){

                arr[i] = sc.nextInt();
                if(arr[i]%2==0){

                        ecount= ecount +arr[i];
                }
                else{
                ocount = ocount + arr[i];
                }
        }

        System.out.println("even no sum in array : " + ecount);
        System.out.println("odd no sum in array : " + ocount);

        }

}


