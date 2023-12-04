package divideandconquer;

public class Client {

	public static void main(String[] args) {
		System.out.println(Max.max(new int[] { 0, 44, -44, 3, 3, 0 }));
		System.out.println(Max.max(new int[] { 70, 250, 50, 80, 140, 12, 14 }));
		System.out.println(Max.max(new int[] { 70, 250, 50 }));
		System.out.println(Max.max(new int[] { 70, 250 }));
		System.out.println(Max.max(new int[] { 70 }));
		System.out.println(Max.max(new int[] {}));
	}

}
