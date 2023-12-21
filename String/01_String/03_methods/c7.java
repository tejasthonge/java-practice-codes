//method: equalsIgnoreCasse(String str);
//
//description:it compars two string ingoring the charctols case
//
//parametor:Sting
//return type:boolean
//


class equalsIngoreCaseDemo{

	public static void main(String[] boss){
	
		String str1="maratha";
		String str2="Maratha";

		System.out.println(str1.equalsIgnoreCase(str2));
	
		System.out.println(myEqualsIgnoreCase(str1,str2));

		
		
		}

	   //myEqualsIgnoreCase(Strig str1,String str2)


                static boolean myEqualsIgnoreCase(String str1 ,String str2){
			boolean a= false;
                        char arr1[] = str1.toCharArray();
                        char arr2[] = str2.toCharArray();

			if (arr1.length==arr2.length){

                     	   for(int i =0;i<arr1.length;i++){

				if(arr1[i]-arr2[i] =32 || arr1[i]-arr2[i]=-32 || arr1[i]-arr2[i]=0){
			 			a=true;
			 		}
		 		}
			}
			else{
			}
			return a;

	
	}

}
