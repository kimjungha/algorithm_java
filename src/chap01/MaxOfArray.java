package chap01;
import java.util.Scanner;
public class MaxOfArray {
	//배열의 최댓값을 반환하는 함수 Maxof를 정의 
	static int maxof(int[] a) {
		int max  = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다. ");
		System.out.print("사람의 수 :");
		int num = stdIn.nextInt(); //배열의 요소수를 입력받음 
		
		int[] height = new int [num];
		for (int i = 0; i < num; i++) {
			System.out.print("height{"+i+"]:");
			height[i] = stdIn.nextInt();
			
		}
		System.out.println("최댓값은"+maxof(height)+"입니다.");
		
	}

}
