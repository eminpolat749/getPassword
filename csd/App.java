package csd;

class App {
	public static void main(String [] args)
	{
		GetRandomTextTest.run();
	}
}

class GetRandomTextTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				break;
			
			System.out.printf("Şifre:%s%n", StringUtil.getRandomTextTR(n, r));
			System.out.printf("Password:%s%n", StringUtil.getRandomTextEN(n, r));
		}
	}
}

class StringUtil {
	public static String getRandomTextTR(int n, java.util.Random r)
	{
		return getRandomText(n, "abcçdefgğhıijklmnoöprsştuüvyz", r);		
	}
	
	public static String getRandomTextEN(int n, java.util.Random r)
	{
		return getRandomText(n, "abcdefghijklmnopqrstuvwxyz", r);
	}
	
	public static String getRandomText(int n, String alphabet, java.util.Random r)
	{
		int len = alphabet.length();
		String tmp = "";
		
		for (int i = 0; i < n; ++i) 
			tmp += alphabet.charAt(r.nextInt(len));
		
		return tmp;
	}
}


