
import java.io.*;

class q1 {

        public static void main(String[] boss) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter the no of row (only 4)");
        int row =Integer.parseInt(br.readLine());
        
	char ch = 'D';
	int k = row;
	for(int i=1; i<=row;i++){
		
		

		for(int j = 1; j<=row;j++){
		if(i%2!=0)
			System.out.print((ch--)+""+(k--)+"  ");
		else
			System.out.print((ch++)+""+(k++)+"  ");
		
		}
	if(i%2==0){
           k--;	
           ch--;}
	else{
	   k++;
           ch++;}
	System.out.println();
	}



        
	}
}


