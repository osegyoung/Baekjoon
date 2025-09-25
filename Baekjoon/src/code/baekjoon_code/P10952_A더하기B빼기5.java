package code.baekjoon_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class P10952_A더하기B빼기5 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		while(true) {
//			int A = in.nextInt();
//			int B = in.nextInt();
//			
//			if(A==0 && B == 0) {
//				in.close();
//				break;
//			}
//			System.out.println(A+B);
//		}
//	}
//}

//public class P10952_A더하기B빼기5 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//		
//		while(true) {
//			st = new StringTokenizer(br.readLine(), " " );
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			if(A == 0 && B == 0) {
//				break;
//			}
//			sb.append((A + B)).append('\n');
//		}
//		System.out.println(sb);
//	}
//}
// Scanner 사용시 시간이 너무 많이 걸린다. 
// BufferedReader.readLin();을 통해 입력을 받는다. 이는 문자령 한 줄을 한번에 입력받기 때문에 공백까지 입력되어비린다. 그렇기 때문에 공백을 기준으로 문자열을 분리해주어야 한다.
// 두가지 방법이 있음. 1) String.split()을 통해 분리해주는 방법, StringTokenizer로 분리되어 저장하면서 꺼내오는 방법
// StringTokenizer을 통해 문자열분리한 뒤 꺼내오는 메소드, nextToken()은 문자열을 반환하니 Integer.parseInt() int 형으로 변환시켜주어야 한다.
// 또한 StringBuilder을 사용 할 것이다.

public class P10952_A더하기B빼기5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;

			if (A == 0 && B == 0) {
				break;
			}
			sb.append((A + B)).append('\n');
		}
		System.out.println(sb);
	}
}

// charAt()의 경우 문자로 반환되기 때문에 반드시 -48(또는 -'0')을 해주어야 정수 형태가 나온다.