package domain;
import java.util.Scanner;

public class Racing {
	private Car cars[];
	private String carNames[];
	private int k;
	Scanner sc;
	
	public Racing() {
		init();
	}
	
	void init() {
		MakeCar();
		MakeTryNumber();
	}
	
	void MakeCar() {
		sc = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		String names = sc.next();
		carNames = names.split(",");
		cars = new Car[carNames.length];
		
		for(int i=0 ; i<carNames.length ; i++) 
			cars[i] = new Car(carNames[i]);
		
	}
	
	void MakeTryNumber() {
		System.out.println("�õ��� ȸ���� ��ȸ�ΰ���?");
		this.k = sc.nextInt();
	}
	
	void PrintCarsPosition() {
		System.out.println("���� ���");
		for(int i=0 ; i<cars.length ; i++) {
			System.out.print(cars[i].getName()+" : ");
			for(int j=0 ; j<cars[i].getPosition();j++)
				System.out.println("-");
		}
	}
	
	void CarsMove() {
		int random;
		for(int i=0 ; i<cars.length ; i++) {
			random = (int)(Math.random()*9);
			if(random>3)
				cars[i].move();
		}
	}
	
	
}
