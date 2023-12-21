import java.util.*;


class sarkariDavakhana {

	String Fild = null ;


        sarkariDavakhana(String Fild){
	      	this.Fild = Fild;
	}
	      /*  if(Fild.equals("bon")){
			sarkariDavakhana.nDr1(Fild);
	
		}
		if(Fild.equals("mendu")){
	
			sarkariDavakhana.nDr2(Fild);
		}
		if(Fild.equals("dentist")){
		
			sarkariDavakhana.nDr3(Fild);
	
		}*/
	


	static void nDr1(String Fild){
		
		System.out.println("contact bon dr mote ");
	}

	static void nDr2(String Fild){
			
		System.out.println("contact breain dr Deshmukh");
	}
	static void nDr3(String Fild){
		
		System.out.println("contact Dentist dr manjare ");
	}
}


class ArrayListDemo{


	public static void main(String[] boss){
	

		ArrayList hpt1 = new ArrayList();
//		ArrayList hpt2 = new ArrayList();
//		ArrayList hpt3 = new ArrayList();


		sarkariDavakhana d1 = new sarkariDavakhana("mendu");
		sarkariDavaKhana d2 = new sarkariDavakhana("bon");
		sarkariDavaKhana d3 = new sarkariDavaKhana("dentist");

		//sarkariDavakhana
		hpt1.add(d1);
		hpt1.add(d2);
		hpt1.add(d3);

		System.out.println("filds in hospital1 :" + hpt1);


	
	}


}
