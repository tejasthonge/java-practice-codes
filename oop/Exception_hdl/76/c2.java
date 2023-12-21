//stackoverflow exeption handle by user by this way
class stackDemo{

        static void fun(int x){

                System.out.println(x);
                try{
		       	fun(++x);//recursiv call: the function call it self 
				
			
		}
		catch(StackOverflowError e){

		
			System.out.print("Exeption in thread" + " " + Thread.currentThread().getName() +" " );   //this print -->current thread
			e.printStackTrace();  // theis print -->java.lang.StackOverflowError
		}
				};

        public static void main(String[] boss){

                fun(1);


        }
}

