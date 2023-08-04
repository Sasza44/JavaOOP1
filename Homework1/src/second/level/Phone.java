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
		this.number = "8-" + this.number;
		Network n = new Network(this.number);
		int i = 0;
		while(numbers[i] != null) {
			i += 1;
		}
		numbers[i] = n;
	}
	
	public void outgoingCall(String number) { // вихідний дзвінок
		if(this.number.indexOf("8-") != 0) {
			System.out.println("Your number isn't registered");
		}
		if(number.indexOf("8-") != 0) {
			System.out.println("Subscriber's number isn't registered");
		}
		if(this.number.indexOf("8-") == 0 && number.indexOf("8-") == 0) {
			System.out.println("Your call is successful");
			inletCall(this.number);
		}
	}
	
	public void inletCall(String number) { // вхідний дзвінок
		System.out.println("Number " + number + " is calling you");
	}
}