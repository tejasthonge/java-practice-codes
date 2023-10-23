class c7{


        static void fun(int arrx[] ){

                for(int i= 0 ; i<arrx.length;i++){

                        arrx[i]= arrx[i]+100;


                }

        }

        public static void main(String[] boss){

                int arr[] = {1,2,3,4};
                System.out.println("wethout callin the fun");
                for(int i= 0; i <arr.length; i++){
                System.out.println(arr[i]);
                }
                System.out.println("calling the fun");
                fun(arr);

                System.out.println("affter calling the fun");

                for (int i = 0; i<arr.length;i++){
                System.out.println(arr[i]);
                }
        }


}

