interface Demo{

        void fun();

	static void gun(){
	
	
		System.out.println("in static gun");

	
	}

	default void run(){

                System.out.println("this can not be overrideble or not inherite to chaild");

        }

}

