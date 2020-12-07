import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	// Early Initialization
	// private static Singleton soleInstance = new Singleton();

	private static volatile Singleton soleInstance;

	private Singleton() {
		if (soleInstance != null)
			throw new RuntimeException("Cannot create , use getInstane()");

		System.out.println("Inside Constructor");
	}

//	public static synchronized Singleton getInstance() {

	/*
	 * making method synchronized might make slow and cause performance
	 */

	public static Singleton getInstance() {

		if (soleInstance == null) {
			// Double Check Locking
			synchronized (Singleton.class) {
				if (soleInstance == null) {
					System.out.println("Creating singleton Object");
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}

	public Object readResolve() throws ObjectStreamException {
		System.out.println(" .. Read Resolve ..");
		return soleInstance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println(" .. Cloining object ..");
		return soleInstance;
	}

}
