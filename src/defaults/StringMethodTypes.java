package defaults;

public class StringMethodTypes {

	public static void main(String[] args) {
			
		String nameIs = "linga";
		int leng=nameIs.length();
		String rev=".";
		for (int i=leng-1;i>=0;i--)
		{
			rev=rev+nameIs.charAt(i);
			}
		System.out.println("my name is not this plz do check idiots " + rev);
	}

}