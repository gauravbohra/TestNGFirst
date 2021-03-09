
public class RestAssuredTest {

	public static void main(String[] args) {
		String s1="test";
		String s2="test";
		String s3=new String("test");
		String s4="te"+"st";
		char[] arr= {'t','e','s','t'};
		String s5=arr.toString();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);

	}

}
