package a;

public class B {
	private static int teste = 0;
	public final int testeFinal = 1;
	private String c;
	private String e = "B: shadow super";
	private int a = 1;
	protected int d;
	private int[] array = new int[] { 1, 2, 3 };
	private String[] arrayS = new String[] { "a", "b", "c" };
	public char m= 'a';

	public void ola() {
		System.out.println("B: ola sou um metodo da superclasse");
	}
}

/*
 * class E extends B { boolean f;
 * 
 * public int g(int h) { return d + h; }
 * 
 * public static long i = 10L; }
 */
