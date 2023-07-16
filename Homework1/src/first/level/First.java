package first.level;

public class First {

	public static void main(String[] args) {
		Goods pork = new Goods("pork", 185.89, 1.0); // свинина
		Goods bread = new Goods("brown bread", 17.30, 0.5); // чорний хліб
		//System.out.println(bread.getPrice());
		bread.setPrice(17.40);
		System.out.println(pork);
		System.out.println(bread);
	}
}