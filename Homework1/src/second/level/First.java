package second.level;

public class First {
	
	public static void main(String[] args) {
		Phone[] phones = new Phone[10]; // масив зареєстрованих номерів (з запасом)
		Network net1 = new Network(phones);
		Phone phone0 = new Phone("096-403-68-61"); // введення 1-го номера
		Phone phone1 = new Phone("097-983-90-60"); // введення 2-го номера
		phone0.register(net1); // реєстрація 1-го номера в мережі оператора
		phone1.register(net1); // реєстрація 2-го номера в мережі оператора
		phone0.outgoingCall("097-983-90-60"); // вихідний дзвінок з 1-го номера на 2-ий
	}
}