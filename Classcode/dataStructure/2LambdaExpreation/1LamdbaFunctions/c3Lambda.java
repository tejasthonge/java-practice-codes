/*
###Lambda Expretion :
        --this way to write stracture the data in such a way that optiomaxetion of code or
        --reduce the use ram by not creating the new anonymus inner class 
        --by this thard class that is anonymous inner class is not created
        --we know class creation is heavy opretion to redious this 
        --Lambda funtion is intrudus in version 1.8
        --befor that this is not present in java

	--Lambda Function aplicable only on functional interface
	     *functional interface :
		--the interface which contanins only one method 
		--eg: -Runable
		      -Comparator
 	
 */

interface Core2web{

        void lang();

}

interface Incubator{

        String framework(String name);
}

class year2022{

        public static void main(String[] boss){

                Core2web sub = ()->{  //this is lambda expreation or function

                        System.out.println("c programing");

                };

                sub.lang();

                //their are diffarent or essy way to write 
                //--we write this due lambda function works only on functionl interface
                //--means only one method is present on it
                //--so compire are essesy to andustand

                //way:1
		Core2web sub1 = ()->System.out.println("java programing");
                sub1.lang();
		
		//this is not correct
	/*	//way2:
		Core2web sub2 = ->System.out.println("Dart Dart");
		sub2.lang();
		*/

		//using one paramertor
                Incubator far1 = (String name)->{

                return "framework: " + name;

                };
                System.out.println(far1.framework("flutter"));

                //war2
                Incubator far2 = (name)->{    // not type name fequre for parametor

                        return "faramework: " + name;

                };
                System.out.println(far2.framework("Py + ML"));

		//way3:
		Incubator far3 = (name)-> "farmework: "+ name;
		System.out.println(far3.framework("AI"));

                //way:4
                Incubator far4 = name-> {

                        return "faramwork: "+ name;
                };



                System.out.println(far4.framework("Spring boot"));

        }

}

