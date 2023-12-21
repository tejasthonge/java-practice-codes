//method :replace(old char,new char)
//
//Dis:it repalecet the charetor by new charetor 
//
//parametor:old char or new char
//return type :String
//


class replaceDemp{

	public static void main(String[] boss){
	
		String str="mitr maratha man manus maza";
		System.out.println(str.replace('m','M'));   //it repace all m by M
					
		System.out.println(myReplace(str,'m','#'));
	}


			  //myReplace(String ,char ,char)

			static String myReplace(String str , char old1 ,char new1){
			
				char arr[] = str.toCharArray();
				for(int i = 0 ; i<arr.length;i++){
				
					if(arr[i]==old1){
					arr[i] =new1;
					}
				}
			
				String str1 = arr.toString();
				return str1;
			}




}
