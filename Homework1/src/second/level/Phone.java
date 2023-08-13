package second.level;

public class Phone {
	private String number;
	private boolean isRegistered = false;
	private Network net;

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
	
	public void register(Network net) {  // реєстрація номеру телефону в мережі
		this.net = net;
		net.addNumber(this);
		this.isRegistered = true;
	}
	
	public void outgoingCall(String number) { // вихідний дзвінок
		if(this.isRegistered == false) {
			System.out.println("Your number isn't registered in the network");
			return;
		}
		if(this.net.searchPhone(number) == null) {
			System.out.println("The subscriber's number isn't registered");
			return;
		}
		if(this.isRegistered == true && this.net.searchPhone(number) != null) {
			System.out.println("Your call is successful");
			this.net.searchPhone(number).inletCall(this.number);
		}
	}
	
	public void inletCall(String number) { // вхідний дзвінок
		System.out.println("Number " + number + " is calling you");
	}
}