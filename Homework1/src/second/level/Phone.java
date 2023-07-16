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
		Network n = new Network(this.number);
		int i = 0;
		while(numbers[i] != null) {
			i += 1;
		}
		numbers[i] = n;
	}
	public void outgoingCall(String number, Network[] numbers) { // вихідний дзвінок
		int i = 0;
		boolean b1 = false; // біт, який виявляє, чи зареєстрований номер абонента в мережі
		boolean b2 = false; // біт, який виявляє, чи зареєстрований номер, на який дзвонить абонент, в мережі
		while(numbers[i] != null) {
			if(numbers[i].getNumber() == this.number) {b1 = true;}
			else if(numbers[i].getNumber() == number) {b2 = true;}
			i += 1;
		}
		if(b1 == false) {System.out.println("Your number isn't registered");}
		else if(b2 == false) {System.out.println("Subscriber's number isn't registered");}
		else {System.out.println("Your call is successful");}
	}
	public void inletCall(String number) { // вхідний дзвінок
		System.out.println("Number " + number + " is calling you");
	}
}