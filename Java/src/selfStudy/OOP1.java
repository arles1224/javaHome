package selfStudy;

import java.util.*;
import java.text.*;

public class OOP1 {

	public static void main(String[] args) {
		/*
		 * 응용문제1.
		 * 사용자가 금액을 8번 입력한 후에 최종 합계 금액을 출력하는 프로세스를 제작하시오.
		 * 예시)
		 * "입금할 금액을 입력하세요."
		 * 500
		 * ...
		 * 500 a b c d e f g
		 * "총 입금액은 #,###원 입니다.
		 */
		Bank bank = new Bank();
		bank.process();
	}

}
class Bank {
	DecimalFormat num = new DecimalFormat();
	Scanner scanner = new Scanner(System.in);
	Integer user;
	Integer total = 0;
	LinkedList<Integer> money = new LinkedList<>();
	public void msg(String msg) {
		System.out.println(msg);
	}
	public void process() {
		for(int i=1;i<9;i++) {
			int deposit = getDeposit();
			money.add(deposit);
		}
		int total = money.stream().reduce(0,Integer :: sum);
		msg("총 금액은 "+total+"원입니다.");
		
	}
	public int getDeposit() {
		while(true) {
			try{
				msg("입금할 금액을 입력해주세요.");
				return scanner.nextInt();
			}catch(Exception e) {
				msg("숫자만 입력해 주세요.");
				continue;
			}
		}
	}
}