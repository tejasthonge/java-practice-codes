class staticBlock {

	static{
	
		int x=10;
		System.out.println("in static 1");
	
	
	}
	
	public static void main(String[] boss){
	
	
	System.out.println("in main method");
	
	}
	
	static {
	
		int y=100;
		System.out.println("in static 2");
	}




}

/*out/put:

in static 1
in static 2
in main method 
 */

//here we write two static blok but cheak byte code
//javap -c staticBlock
//
//
/* 

    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String in main method
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return

  static {};
    Code:
       0: bipush        10
       2: istore_0
       3: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       6: ldc           #21                 // String in static 1
       8: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      11: bipush        100
      13: istore_0
      14: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      17: ldc           #23                 // String in static 2
      19: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      22: return
}
*/

//here he take only one 
