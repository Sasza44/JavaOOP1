package second.level;

public class Phone {
	private String number;

	public Phone() {}
	public Phone(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String toString() {
		return "Phone [number=" + number + "]";
	}

	public void register(Network[] numbers) { // реєстрація номеру телефону в мережі
		this.number = "+38-" + this.number;
		Network n = new Network(this.number);
		int i = 0;
		while(numbers[i] != null) {
			i += 1;
		}
		numbers[i] = n;
		//System.out.println(this.number);
	}
	public void outgoingCall(Phone p) { // вихідний дзвінок
//		int i = 0;
//		boolean b1 = false; // біт, який виявляє, чи зареєстрований номер абонента в мережі
//		boolean b2 = false; // біт, який виявляє, чи зареєстрований номер, на який дзвонить абонент, в мережі
//		while(numbers[i] != null) {
//			if(numbers[i].getNumber() == this.number) {b1 = true;}
//			else if(numbers[i].getNumber() == p.getNumber()) {b2 = true;}
//			i += 1;
//		}
//		if(b1 == false) {System.out.println("Your number isn't registered");}
//		else if(b2 == false) {System.out.println("Subscriber's number isn't registered");}
//		else {System.out.println("Your call is successful");}
		String s1 = this.number.substring(0, 3); // перші 3 символи цього номеу
		String s2 = p.getNumber().substring(0, 3); // перші 3 символи номеру, на який здійснюється дзвінок
		if(!s1.equals("+38")) {
			System.out.println("Your number isn't registered");
		}
		if(!s2.equals("+38")) {
			System.out.println("Subscriber's number isn't registered");
		}
		if(s1.equals("+38") && s2.equals("+38")) {
			System.out.println("Your call is successful");
		}
	}
	public void inletCall(Phone p) { // вхідний дзвінок
		System.out.println("Number " + p.getNumber() + " is calling you");
	}
}