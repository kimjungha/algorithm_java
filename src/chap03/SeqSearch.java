package chap03;
import java.util.Scanner;

class SeqSearch {
	// 요솟수가 n인 배열 a에서 key 와 같은 ㅛㅇ소를 선형 검색합니다. 
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			if(i ==n)
				return -1; // 검색 실패(-1을 반환)
			if(a[i] ==key)
				return i; //검색 성공(인덱스를 반환)
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수:");
		int num = stdIn.nextInt();
		int[] x = new int[num]; //요솟수가 num인 배열
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"]=");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값:");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x,  num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다. ");
		else
			System.out.println(ky+"는 x["+idx+"]에 있습니다. ");
		
	}
	
	
	
}
