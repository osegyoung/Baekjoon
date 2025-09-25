package code.baekjoon_code;

//import java.util.Scanner;
//
//public class P10950_A더하기B빼기3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int c = sc.nextInt();
//		int arr[] = new int[c];
//		
//		for(int i=0; i < c; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			arr[i] = a + b;
//		}
//		sc.close();
//		
//		for (int k : arr) {
//			System.out.println(k);
//		}
//	}
//}




import java.util.Scanner;

public class P10950_A더하기B빼기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
