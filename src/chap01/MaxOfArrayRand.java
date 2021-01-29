package chap01;
import java.util.Random;
import java.util.Scanner;


public class MaxOfArrayRand {
	
	static int maxof(int[] a) {
		int max  = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}  //배열의 최댓값을 호출해주는 함수 정의 
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다. ");
		System.out.print("사람의 수 :");
		int num = stdIn.nextInt(); //배열의 요소수를 입력받음 
		
		int[] height = new int [num]; //사람의 수 만큼(num) 배열 생성 
		
		for (int i = 0; i < num; i++) {
			height[i] = 100+rand.nextInt(90); //정수 난수 생성하는 메서드 nextInt
			System.out.println("height["+i+"]"+height[i]);
		} //키가 난수로 입력됌 
		//nextInt(n)은 0부터 n-1까지의 난수입니다. 
		System.out.println("최댓값은"+maxof(height)+"입니다.");
		
		
	}

}
