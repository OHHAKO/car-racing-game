package domain;
import java.util.Scanner;

public class Racing {
	private Car cars[];
	private String carNames[];
	int length;
	
	public Racing() {
		init();
	}
	
	void init() {
		MakeCar();
	}
	
	void MakeCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		String names = sc.next();
		carNames = names.split(",");
		cars = new Car[carNames.length];
		
		for(int i=0 ; i<carNames.length ; i++) {
			cars[i] = new Car(carNames[i]);
		}
	}
	
}
