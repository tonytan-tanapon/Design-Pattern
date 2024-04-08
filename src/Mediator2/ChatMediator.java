package Mediator2;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);

	public void sendMessage(String msg, Position position);
	
	void addUser(Position user);
}