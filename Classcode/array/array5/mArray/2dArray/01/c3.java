
	class c3{

        public static void main(String[] boss){

                int arr[][] = new int[2][2];
                arr[0][0]= 10;
                arr[0][1]= 10;
                arr[1][0]= 10;
                arr[1][1]= 10;
                for (int[] x :arr){

                        for (int y : x){
                        System.out.print(y);

                        }
                System.out.println();
                }


        System.out.println("the element in 1st 1st collam is"+arr[0][0]);
        System.out.println("the size of arr 2dArray :"+arr.length);
        System.out.println("the size of 0th index 1dArray :"+arr[0].length);
        System.out.println("the size of 1st index 1dArray :"+arr[1].length);

        // by following we can print their heap section id or refrance or in kwon as addrese

        System.out.println("the addrese of arr name 2dArray:"+arr+"this [[ stnd for 2dArrar or I is stands for int type 2dArray");
        System.out.println("the addrese of 0th index 1dArray is "+arr[0]);
        System.out.println("the addrese of 1ts index 1dArray is:"+ arr[1]+"this [ sigale squre braket stand for 1dArray and 'I' for int type");
        System.out.println();


        //cheak identityHashCode of array

        System.out.println("identityHashCode of 2dAarry: "+System.identityHashCode(arr));
        System.out.println("identityHashCode of 0th on element in 2dArray or 1st row is 1dArray that is arr[0] : "+System.identityHashCode(arr[0]));
         System.out.println("identityHashCode of 1th on element in 2dArray or 2st row is 1dArray that is arr[1] : "+System.identityHashCode(arr[1]));

	 //checking identiyHashCode of each ellemt in 2dArray 10 is ellemnt and it is in bettwen range of -128 to 127 tht is store in integerCache 
	
	 for (int i = 0 ; i<arr.length;i++){
		 for (int j = 0 ;j<arr[i].length;j++){
 	System.out.println("identityHashCode of "+i+"th row "+j +"th index element : "+System.identityHashCode(arr[i][j]))	 ;
        	}
	 }
	}









}
