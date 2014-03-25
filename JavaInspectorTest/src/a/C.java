package a;

public class C extends B {
	// duplicados com B
	private int a = 2;
	private String e = "C: shadow sub";

	// duplicados com D
	public boolean cb = true;

	// desta classe
	private String staticS = "C: eu sou string da C";
	
	public static String staticString = "sou static string";

	public String metodo2(String arg1, int arg2) {
		return "String: " + arg1 + "int: " + arg2;
	}

	public String metodo3(int arg1, int arg2, float arg3) {
		return "int: " + arg1 + " int: " + arg2 + " float: " + arg3;
	}
	
	public int metodo4(int i){
		return i+1;
	}
}
