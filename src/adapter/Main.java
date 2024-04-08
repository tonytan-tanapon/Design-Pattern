package adapter;

public class Main {
	public static void main(String[] args) {
		JsonLogger a = new JsonLogger();
		XMLLogger b = new XMLLogger();
		LoggerAdapter c = new LoggerAdapter(b);
		a.logMessage();
		c.logMessage();
	}
}
