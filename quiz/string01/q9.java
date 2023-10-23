class Core2Web {
	public static void main(String[] args) {
		String var1 = new String("Shashi");
		String var2 = var1.reverse();
		System.out.println(var1);
		System.out.println(var2);
	}
}

//error: cannot find symbol
//		String var2 = var1.reverse();
		                  ^
//  symbol:   method reverse()
//  location: variable var1 of type String

