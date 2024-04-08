package Mediator2;

public abstract class Position {
	protected ChatMediator mediator;
	protected String name;
	
	public Position(ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	
	public abstract void receive(String msg);
}