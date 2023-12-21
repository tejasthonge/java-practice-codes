class saticDemo{

	static int x = 10 ;
	static int y = 20;
}

//comlie the code and check the byte code what is the looking in the byte code
//

//following is byte code
//
/*
 class saticDemo {
  static int x;

  static int y;

  saticDemo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10
       2: putstatic     #7                  // Field x:I
       5: bipush        20
       7: putstatic     #13                 // Field y:I
      10: return
}

 */

