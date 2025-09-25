package code.baekjoon_code;

import java.util.Scanner;

//재귀 문제 - 자신을 정의할 때 자기 자신을 재 참조하는 방법 
public class P10872_팩토리얼 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//int N = Integer.parseInt(br.readLine();
	
	// int sum factorial(N);
	// System.out.println(sum);

	private static int factorial(int N) {
		if(N <=1 ) return 1 ; // 재귀종료 조건 
		return N * factorial(N -1);
	}
	
}

// 재귀 호출이 너무 반복적으로 되면, 즉, 재귀가 깊어지면 자바에서는 Stack OverFlow라는에러를 뱉는다.
// 재귀함수의 경우 함수를 반복적으로 호출하는 만큼 메모리에 스택이 되기 때문에 결국 메모리를 엄청나게 차지하게 된다.
// 그리고 재귀함수가 끝날 때는 함수를 닫으면서 스택된 메모리에서 pop을 하기 때문에 수행시간 또한 매우 느려진다.
// 결국 재귀 호출을 하다가 메모리가 부족해지는 것과 성능리 저하되는 것이 일상이기 때문에 이러한 이유로 재귀호출은 
// 평상시에 알고리즘 자체가 재기가 자연스럽거나 호출을 많이 하지 않는 범위일 쓰이고 그 외에는 자주 쓰이지 않는다.

// 재귀 함수가 끝나는 지점을 정확하게 구현해야한다. 이는 재귀에서는 끝나는 지점이 명확하지 않느면 자칫 무한루프에 빠지기 쉽다.