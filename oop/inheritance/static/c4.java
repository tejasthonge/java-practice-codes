class parent{

        int x =10;
        static int y =20;
        static{
                System.out.println("in parent static block");

        }

        parent(){

                System.out.println("in parent constructor");

        }
        void methodOne(){

                System.out.println(x);
                System.out.println(y);

        }
        static void methodTwo(){
		parent obj = new parent();
		System.out.println(obj.y);
                System.out.println(y);
        }

}
class child extends parent{

        static {


                System.out.println("in child static block");
        }
        child(){

                System.out.println("in child constructor");
        }

}

class client{

        public static void main(String[] boss){

                System.out.println("in main");
                child obj = new child();
		obj.methodOne();
		obj.methodTwo();


        }


}

/*
 output-->
 
in main
in parent static block
in child static block
in parent constructor
in child constructor
10
20
in parent constructor
20
20


 */
