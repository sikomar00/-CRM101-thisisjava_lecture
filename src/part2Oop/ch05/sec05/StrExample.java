package part2Oop.ch05.sec05;

public class StrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 =new String("hong");
		String name2 =new String("hong");//똑같은거 이미 있으니까 새로 안만듬
//		String name2 = "hong"; //new 안한거
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
	}

}
//스트링 객체는 왜 주소값이 나오지 않는가?