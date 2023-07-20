package second.level;

public class First {

	public static void main(String[] args) {
		Phone phone1 = new Phone("096-403-68-61"); // введення 1-го номера
		Phone phone2 = new Phone("097-983-90-60"); // введення 2-го номера
		Network[] numbers = new Network[10]; // масив зареєстрованих номерів (з запасом)
		phone1.register(numbers); // реєстрація 1-го номера в мережі оператора
		phone2.register(numbers); // реєстрація 2-го номера в мережі оператора
		phone1.outgoingCall(phone2); // вихідний дзвінок з 1-го номера на 2-ий
		phone1.inletCall(phone2); // вихідний дзвінок на 1-й номер з 2-го
	}
}