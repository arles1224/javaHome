package selfStudy;

public class OOP4 {

	public static void main(String[] args) {
		/*
		 * (주)이루온
		 * 해당 원시 배열 데이터를 이용해 추상 클래스에서 해당 결과값이 도출될 수 있도록 코드를 작성하시오.
		 * 회원 전체의 포인트 합계를 출력하시오 (abstract 사용)
		 *  ※추상 클래스 명은 Userinfo2입니다.
		 */
		Eruon eruon = new Eruon();
		eruon.data();
	}

}
class Eruon extends Userinfo2{
	Integer total = 0;
	@Override
	public void data() {
		int ea = this.data.length;
		for(int i =0;i<ea;i++) {
			total += Integer.parseInt(this.data[i][6]);
		}
		System.out.println(total);
	}
}