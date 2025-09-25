package code.baekjoon_code;

import java.util.Scanner;

//import java.util.Scanner;

//
//import java.util.Scanner;
//
//public class P1330_두수비교하기 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int A = in.nextInt();
//		int B = in.nextInt();
//		
//		in.close();
//		
//		String str = (A>B) ? ">" : ((A<B) ? "<" : " == " );
//		System.out.println(str);
//	}
//}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class P1330_두수비교하기{
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String[] str = br.readLine().split(" ");
//		int A = Integer.parseInt(str[0]);
//		int B = Integer.parseInt(str[1]);
//		
//		System.out.println((A>B) ? ">" : ((A<B) ? " < " : " == "));
//	}
//}

//public class P1330_두수비교하기 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		if(A > B) {
//			System.out.print(">");
//		}else if (A < B) {
//			System.out.print("<");
//		}else {
//			System.out.print("=");
//		}
//	}
//	 
//}

public class P1330_두수비교하기 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 String answer = a > b ? ">" : a< b ? "<" : " == ";
		 System.out.println(answer);
	 }
}
