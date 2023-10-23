

/*
 
WeakHashMap:

	--object created on heap setction are not collected by GC in normal map 
	--but in this WeakHashMap this is happan
	--object is removed or collect by  GC when their is no refance of that object

 
 */


Class NormalMap{

	public static void main(String[] boss){
	
	

		String c1 = "JAVA";
		String c2 = "PYTHON";
		String c3 = "DART";
		HashMap hs = new HashMap();
		hs.put(c1,".java");
		hs.put(c2,".py");

		System.out.println(hs);

		System.gc(hs);
		hs.put(c3,".dart");


	
	}


}
