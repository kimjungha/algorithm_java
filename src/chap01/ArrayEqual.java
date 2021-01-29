package chap01;
import java.util.Scanner;

public class ArrayEqual {
	
	// �몢 媛�吏� 諛곗뿴�쓽 紐⑤뱺 �슂�냼媛� 媛숈�媛� �솗�씤�븯�뒗 硫붿꽌�뱶 �젙�쓽 
			static boolean equals(int[]a, int[] b) {
				
				if (a.length!=b.length) {
					return false;
				} //諛곗뿴�쓽 �겕湲곌� �삊媛숈� �븡�떎硫� false諛섑솚
				
				for (int i = 0; i < a.length; i++) {
					if (a[i]!=b[i]) {
						return false;
					}
				}//諛곗뿴�쓽 �슂�냼瑜� �븯�굹�뵫 �솗�씤�븯�뿬 �슂�냼媛믪씠 �떎瑜쇨꼍�슦  false 異쒕젰
				
				return true; //�슂�냼 媛믪씠 紐⑤몢 留욎쓣寃쎌슦  true 異쒕젰 
			}
		
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열a의 요소 수 : ");
		int na = stdIn.nextInt(); //배열a의 요소 수 
		
		int[] a = new int[na]; //배열 a 생성
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]=");
			a[i] = stdIn.nextInt();	
		}
		
		System.out.print("배열b의 요소 수 : ");
		int nb = stdIn.nextInt(); //배열a의 요소 수 
		
		int[] b = new int[nb]; //배열 a 생성
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("b["+i+"]=");
			b[i] = stdIn.nextInt();	
		}
		
	// 배열 a 와 배열 b 의 요소 입력 완료 
		
	System.out.println("배열a와 b는 "+ (equals(a,b)?"같습니다.":"같지 않습니다."));
	
		
		
		
	}

}
