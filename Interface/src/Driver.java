
public class Driver {

	public static void main(String[] args) {
		Encryptable hush = new Secret("Wil Wheaton is my hero.");
		System.out.println(hush);
		hush.encrypt();
		System.out.println(hush);
		hush.decrypt();
		System.out.println(hush);
		
		hush = new Password("mycleverpassword");
		System.out.println(hush);
		hush.encrypt();
		System.out.println(hush);
		hush.decrypt();
		System.out.println(hush);
	}

}
