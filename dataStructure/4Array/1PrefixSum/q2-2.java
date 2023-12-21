//given the score of the las 10 over of cricket math
//arr[288,312,330,349,360,383,394,406,436,439]



//1.:
	//How many runs were score in 42 th to 45th  over
//
import java.util.*;
class ArrayQuize{


	public static void main(String[] boss){
	int arr[] =new int[]{288,312,330,349,360,383,394,406,436,439};
	int N = arr .length;
	int s = 45 -  42; 
	Scanner sc = new Scanner(System.in);
	int f= 0;
	int l = 50 - 45 -1;
	int run = 0;


	run = arr[l] -arr[f];
	System.out.println("run 42 to 45 over : "+run);
	}

}

