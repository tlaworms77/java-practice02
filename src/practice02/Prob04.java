package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		StringBuffer str2 = new StringBuffer(str);
		str2.reverse();
		char[] c = new char[str2.length()];
		for(int i=0;i<str2.length();i++) {
			c[i] = str2.charAt(i);
		}
		return c;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
