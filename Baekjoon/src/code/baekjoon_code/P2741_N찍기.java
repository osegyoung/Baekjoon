package code.baekjoon_code;

import java.util.Scanner;

public class P2741_N찍기 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int i = 1;
		
		while(i<=N) {
			System.out.println(i);
			i++;
		}
	}
}
