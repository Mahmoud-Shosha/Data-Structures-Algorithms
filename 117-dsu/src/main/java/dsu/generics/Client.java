package dsu.generics;

public class Client {

	public static void main(String[] args) {
		DSU<String> dus = new DSU<String>(new String[] { "Ahmed", "Ali", "Sami", "Jhon", "Kiks" });
		System.out.println(dus.find("Ahmed").equals(dus.find("Ali")));
		dus.union("Ahmed", "Ali");
		System.out.println(dus.find("Ahmed").equals(dus.find("Ali")));
		System.out.println(dus.find("Jhon").equals(dus.find("Kiks")));
		dus.union("Jhon", "Kiks");
		System.out.println(dus.find("Jhon").equals(dus.find("Kiks")));
		System.out.println(dus.find("Ahmed").equals(dus.find("Jhon")));
		dus.union("Ali", "Kiks");
		System.out.println(dus.find("Ahmed").equals(dus.find("Jhon")));
		System.out.println(dus.find("Ali").equals(dus.find("Sami")));
		dus.union("Sami", "Kiks");
		System.out.println(dus.find("Ali").equals(dus.find("Sami")));
	}

}
