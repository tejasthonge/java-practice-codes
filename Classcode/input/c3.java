//passing the inter to steing by using wraper class 

import java.io.*;

class c3 {

        public static void main(String[] boss) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter the no int");
        int i =Integer.parseInt(br.readLine());
        System.out.println(i+10);




        }
}

