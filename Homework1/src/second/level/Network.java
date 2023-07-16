package second.level;

public class Network {
	private String number;

	public Network() {}
	public Network(String number) {
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
}