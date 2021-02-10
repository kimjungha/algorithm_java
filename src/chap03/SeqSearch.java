package chap03;
import java.util.Scanner;

class SeqSearch {
	// ��ڼ��� n�� �迭 a���� key �� ���� �ˤ��Ҹ� ���� �˻��մϴ�. 
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		while (true) {
			if(i ==n)
				return -1; // �˻� ����(-1�� ��ȯ)
			if(a[i] ==key)
				return i; //�˻� ����(�ε����� ��ȯ)
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��ڼ�:");
		int num = stdIn.nextInt();
		int[] x = new int[num]; //��ڼ��� num�� �迭
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x["+i+"]=");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�˻��� ��:");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x,  num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�. ");
		else
			System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�. ");
		
	}
	
	
	
}
