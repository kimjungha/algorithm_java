package chap01;

public class Max3m {
	static int max3(int a,int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		return max;
	} //최댓값을 반환하는 함수로 만든것 
	//꼭 메인안에서 동작 
	public static void main(String[] args) {
		System.out.println(max3(2, 44, 2));
	}
	
}
