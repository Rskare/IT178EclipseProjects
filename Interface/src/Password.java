import java.util.Random;

public class Password implements Encryptable{
	public final static int RANGE = 26;

	private String password;
	private boolean encrypted;
	private Random generator;
	
	public Password(String pw)
	{
		password = pw;
		encrypted = false;
		generator = new Random();
	}

	@Override
	public void encrypt() {
		if (!encrypted)
		{
			String masked = "";
			for (int index = 0; index < password.length(); index++)
			{
				masked = masked + password.charAt(index);
				masked = masked + (char)(generator.nextInt(RANGE) + 'a');
			}
			password = masked;
			encrypted = true;
		}
		
	}

	@Override
	public String decrypt() {
		if (encrypted)
		{
			String unmasked = "";
			for (int index = 0; index < password.length(); index+=2)
				unmasked = unmasked + password.charAt(index);
			password = unmasked;
			encrypted = false;
		}

		return password;
	}

	public boolean isEncrypted() {
		return encrypted;
	}
	public String toString()
	{
		return password;
	}
}
