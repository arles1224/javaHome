package selfStudy;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {

	public static void main(String[] args) {
		/*
		 * (주)씨이랩
		 * 응용문제2.
		 * 데이터 15,22,37,8,11,19,41 이 있다.
		 * 데이터를 다음 결과 같이 출력하시오.
		 * 결과) [7,15,22,8,11,39,41]
		 */
		Celab celab = new Celab();
		celab.arr();
	}

}
class Celab{
	List<Integer> array = new ArrayList<>();
	List<Integer> test;
	Integer[] prim;
	public void arr() {
		this.prim = new Integer[] {15,22,37,8,11,19,41};
		this.test = new LinkedList<>(Arrays.asList(this.prim));
		this.test.add(0,7);
		this.test.add(7,39);
		this.test.remove(3);
		this.test.remove(5);
		System.out.println(test);
	}
	
}