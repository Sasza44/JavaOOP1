package second.level;

public class Network {
	
	private static Phone[] phones = new Phone[10]; // масив зареєстрованих номерів (з запасом)
	
	public static void addNumber(Phone phone) {
		int i = 0;
		while(phones[i] != null) {
			i += 1;
		}
		phones[i] = phone;
	}
	
	public static Phone searchPhone(String number) {
		int i = 0;
		while(phones[i] != null) {
			if(phones[i].getNumber().equals(number)) {
				return phones[i];
			}
			i += 1;
		}
		return phones[9];
	}
}