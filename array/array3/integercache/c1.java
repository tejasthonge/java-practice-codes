import java.util.*;


class c1 {

	public static void main(String[] boss ){
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 1st int x range of '-128 to 127' ");
		int x = sc.nextInt();

		System.out.println("enter 2nd int y range of '-128 to 127' ");
		int y =sc.nextInt();

		System.out.println("enter 3rd Integer z range of '-128 to 127' ");
		Integer z= sc.nextInt();
		
	
		System.out.println("identitHashCode of above thee is same :it is range of -128 o 127");
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		
		//ID is same for all the abave x y and z
		
		//the resune of the java create same object of integer from "-128 to 127"





		//but supose a b c conten beyond the rang the it shows diferent no as bellow
		
		

                System.out.println("enter 1st int a > 127 ");
                int a = sc.nextInt();

                System.out.println("enter 2nd int b > 127' ");
                int b =sc.nextInt();

                System.out.println("enter 3rd Integer c > 127' ");
                Integer c= sc.nextInt();


                System.out.println("identitHashCode of above three is same :it is range of -128 o 127");

                System.out.println(System.identityHashCode(a));
                System.out.println(System.identityHashCode(b));
                System.out.println(System.identityHashCode(c));


	
	
	} 






}
