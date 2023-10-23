import java.io.*;


class q3{


	public static void main(String[] boss) throws IOException{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter the no of rows(only take 5):");
		int row =Integer.parseInt(br.readLine());
		int k = row;
		for(int i = 1;i<= row;i++){
		
			int n = row;
			for(int j=1;j<=k ;j++){
		        switch (i){
			  
			  case 1:{
			  
				System.out.print(n-- + ""+"  ");
		       		break;		
			  }	
			  case 2:{
			     if(j==1)
				  n=n+3; 
			      
				for(int s =n ; s!=0;s--){
			        if(n%2==0)
				System.out.print(n +"  ");
				n--;}
				
		       		break;		
			  }
			  case 3:{
			if(j==1)		 
			  n = n+4;
			  
			for(int s=n;s!=0;s--){
			if(n%3==0){
			System.out.print(n +""+ "  ");
			
			}
			n--;
			}
			  break;
			  }
		        case 4:{
			if(j==1)
			       n=n+3;
			for (int s= n ; s!=0;s--){
		        if(n%4==0)
			System.out.print(n +"" +"  ");

			n--;
			}
			
			
			break;


			}
			  
			  default:
				 System.out.print(n);
	
		}
	
			
	}
		k--;
	        System.out.println();
		
		
		}	
		




	}}
