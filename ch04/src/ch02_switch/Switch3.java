package ch02_switch;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		  Scanner scanner 
	       = new Scanner(System.in);
	     int money = scanner.nextInt();
	     switch(money/1000) {
	     case 0:System.out.println("걸어 가");break;
	     case 1:System.out.println("자전거 타");break;
	     case 2:System.out.println("버스 타");break;
	     case 3:System.out.println("택시 타");break;
	     default:System.out.println("맘 대로 해");break;
	    
	}

}
}
