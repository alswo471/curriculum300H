package day18;

public class MyCaculatorTest2 {
	public static void main(String[] args) {
		
		int num3 = 10;
		MyCalculator calcu = new MyCalculator() {
			@Override
			public int plus(int num1, int num2) {
				//num3 = 20; �͸�(����) ���� Ŭ������ �޼��忡�� ���Ǵ� ���� ������ ���ȭ �ȴ�
				int result = num1 + num2 + num3;
				return result;
			}
		};
		
		
		int result = calcu.plus(20, 30);
		System.out.println(result);
	}
}
