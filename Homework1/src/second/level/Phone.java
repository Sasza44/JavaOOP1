package second.level;

public class Phone {
	private String number;
	private boolean isRegistered = false;

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
	
	public void register() {  // реєстрація номеру телефону в мережі
		Network.addNumber(this);
		this.isRegistered = true;
	}
	
	public void outgoingCall(String number) { // вихідний дзвінок
		if(this.isRegistered == false) {
			System.out.println("Your number isn't registered in the network");
		}
		if(Network.searchPhone(number) == null) {
			System.out.println("The subscriber's number isn't registered");
		}
		if(this.isRegistered == true && Network.searchPhone(number) != null) {
			System.out.println("Your call is successful");
			Network.searchPhone(number).inletCall(this.number);
		}
	}
	
	public void inletCall(String number) { // вхідний дзвінок
		System.out.println("Number " + number + " is calling you");
	}
}