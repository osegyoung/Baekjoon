package code.baekjoon_code;

import java.util.Scanner;

public class P2753_윤년 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Y = in.nextInt();
		in.close();
		
		if(Y%4==0) {
			if(Y%400 == 0) System.out.println("1");
			else if (Y%100 == 0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
}


//public class P2753_윤년 {
//	public static void main(String[] args)throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int Y = Integer.parseInt(br.readLine());
//		
//		if(Y%4==0) {
//			if(Y%400 == 0) System.out.println("1");
//			else if (Y%100 == 0) System.out.println("0");
//			else System.out.println("1");
//		}
//		else System.out.println("0");
//	}
//}
