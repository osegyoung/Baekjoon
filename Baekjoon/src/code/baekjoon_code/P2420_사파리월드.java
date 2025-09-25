package code.baekjoon_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//public class P2420_사파리월드 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		long number1 = sc.nextInt();
//		long number2 = sc.nextInt();
//		
//		System.out.println(Math.abs(number1 - number2));
//	}
//}


public class P2420_사파리월드 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long number1 = Long.parseLong(st.nextToken());
		long number2 = Long.parseLong(st.nextToken());
		
		System.out.println(Math.abs(number1 - number2));
	}
}
