package a;

import java.util.ArrayList;

public class C extends B {
	// duplicados com B
	private int a = 2;
	private String e = "C: shadow sub";

	// duplicados com D
	public boolean cb = true;

	// desta classe
	private F classeF1 = new F("sou da F");
	private F classeF2;	
	
	
	private String sc = "C: eu sou string da C";
	
	public static String staticString = "sou static string";

	public String metodo2(String arg1, int arg2) {
		return "String: " + arg1 + "int: " + arg2;
	}

	public String metodo3(int arg1, int arg2, float arg3) {
		return "int: " + arg1 + " int: " + arg2 + " float: " + arg3;
	}
	
	public String metodo4(int i){
		return "eu sou metodo4 com arg int" + i;
	}
	
	public String metodo5(int i, float f){
		return "eu sou metodo5.1.1 com arg int: " + i + " arg float:" + f;
	}
	
	public String metodo5(long l, float f){
		return "eu sou metodo5.1.2 com arg long: " + l + " arg float:" + f;
	}
	
	public String metodo5(int i, double d){
		return "eu sou metodo5.2.1 com arg int: " + i + " arg double:" + d;
	}
	
	public String metodo5(double d, int i){
		return "eu sou metodo5.2.2 com arg double: " + d + " arg int:" + i;
	}
	
	public String metodo5(long l, double d){
		return "eu sou metodo5.3.1 com arg long: " + l + " arg double:" + d;
	}
	
	public String metodo6(char c, double d){
		return "eu sou metodo6.1.1 com arg char: " + c + " arg double:" + d;
	}
	
	public String metodo6(String s, double d){
		return "eu sou metodo6.1.2 com arg String: " + s + " arg double:" + d;
	}
}
