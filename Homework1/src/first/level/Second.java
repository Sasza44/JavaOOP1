package first.level;

public class Second {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(20, 46, 31);
		Triangle t2 = new Triangle(110, 82, 136);
		Triangle t3 = new Triangle();
		t3.setSide1(90);
		t3.setSide2(146);
		t3.setSide3(131);
		System.out.println(t1.area());
		System.out.println(t2.area());
		System.out.println(t3.area());
	}
}