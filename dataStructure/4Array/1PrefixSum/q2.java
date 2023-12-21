//given the score of the las 10 over of cricket math
//arr[288,312,330,349,360,383,394,406,436,439]



//1.:
//How many runs were score in last 5 over
//
import java.util.*;
class ArrayQuize{


	public static void main(String[] boss){
	int arr[] =new int[]{288,312,330,349,360,383,394,406,436,439};
	int N =arr.length;
	int over = 5;
	Scanner sc = new Scanner(System.in);
	int f= over - 1;
	int l = N-1;
	int run = 0;


	run = arr[l] -arr[f];
	System.out.println("run in last 5 over : "+run);
	}

}

