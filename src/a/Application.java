package a;

import ist.meic.pa.Inspector;

public class Application {

	public static void main(String args[]) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		//new ist.meic.pa.Inspector().inspect(b);

		// para testar uso da superclasse e/ou shadow
		new ist.meic.pa.Inspector().inspect(c);
		// new ist.meic.pa.Inspector().inspect(d);
		//new ist.meic.pa.Inspector().inspect(e);

	}

}
