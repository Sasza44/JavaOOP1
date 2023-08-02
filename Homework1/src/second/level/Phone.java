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
	}
	
	public void outgoingCall(String number) { // вихідний дзвінок
		String s1 = this.number.substring(0, 3); // перші 3 символи цього номеу
		String s2 = number.substring(0, 3); // перші 3 символи номеру, на який здійснюється дзвінок
		if(!s1.equals("+38")) {
			System.out.println("Your number isn't registered");
		}
		if(!s2.equals("+38")) {
			System.out.println("Subscriber's number isn't registered");
		}
		if(s1.equals("+38") && s2.equals("+38")) {
			System.out.println("Your call is successful");
			Phone ph = new Phone();
			ph.setNumber(number);
			ph.inletCall(this.number);
		}
	}
	
	public void inletCall(String number) { // вхідний дзвінок
		System.out.println("Number " + number + " is calling you");
	}
}