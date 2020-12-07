
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		printDetail("S1", s1);
		printDetail("S2", s2);

	}

	private static void printDetail(String string, Singleton s) {
		System.out.println(string + " has Hashcode : " + s.hashCode());

	}

}
