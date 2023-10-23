import java.io.*;

class q2 {

        public static void main(String[] boss) throws IOException {


	
		InputStreamReader isr = new  InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter the no of rows");
		int row = Integer.parseInt(br.readLine());
		
		for (int i=1 ;i<=row;i++){
		
			for(int j =1 ;j<=row;j++){
			
				if(i==j){
				System.out.print("#"+"  ");
				}
				else{
				System.out.print("="+"  ");
				}
				
			
			}
		System.out.println();
		
		
		}

	
	}



}
