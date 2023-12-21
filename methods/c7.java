
//try and error case3


class c5{

        void fun(float x){

                System.out.println("in fun");
                System.out.println(x);





        }

                public static void main(String[] boss){

                        c5 obj= new c5();
			obj.fun(10);
			obj.fun(10.9f);
			obj.fun('A');    //here the arrgument is not same type that is not float
                                        //run the and cheak the output 
					//we charactore is internaly gos to int  type and gate askyvalue of 'A' that is 60.0  

                }


}

