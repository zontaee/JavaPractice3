package ch03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시 ,나이 , 체중 ,독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		//스캐너타입 변수 선언 및 객체 생성
		String name = scanner.next();
		System.out.println("이름은" + name + ",");
		
		String city = scanner.next();
		System.out.println("도시는" + city + ",");
		
		int age = scanner.nextInt();
		System.out.println("나이는" + age + ",");
		
		double weight = scanner.nextDouble();
		System.out.println("체중은" + weight + ",");
		
		Boolean single = scanner.nextBoolean();
		System.out.println("독신여부" +  single);
		
		scanner.close();




		

	}

}
