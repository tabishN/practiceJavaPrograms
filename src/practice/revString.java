package practice;

public class revString {

	public static void main(String[] args) {
		String s="happy Birthday";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}
