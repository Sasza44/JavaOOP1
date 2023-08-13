package second.level;

public class Network {
	
	private Phone[] phones; // масив зареєстрованих номерів (з запасом)
	
	public Network(Phone[] phones) {
		super();
		this.phones = phones;
	}

	public void addNumber(Phone phone) {
		int i = 0;
		while(this.phones[i] != null) {
			i += 1;
		}
		this.phones[i] = phone;
	}
	
	public Phone searchPhone(String number) {
		int i = 0;
		while(this.phones[i] != null) {
			if(this.phones[i].getNumber().equals(number)) {
				return this.phones[i];
			}
			i += 1;
		}
		return this.phones[9];
	}
}