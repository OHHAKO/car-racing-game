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
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String names = sc.next();
		carNames = names.split(",");
		cars = new Car[carNames.length];
		
		for(int i=0 ; i<carNames.length ; i++) 
			cars[i] = new Car(carNames[i]);
		
	}
	
	void MakeTryNumber() {
		System.out.println("시도할 회수는 몇회인가요?");
		this.k = sc.nextInt();
	}
	
	
	
}
