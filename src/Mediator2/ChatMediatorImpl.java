package Mediator2;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	private List<Position> positions;
	
	
	
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
		this.positions=new ArrayList<>();
	}
	
	@Override
	public void addUser(User user){
		this.users.add(user);
	}
	
	@Override
	public void sendMessage(String msg, User user) {
		for(User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
		
		for(Position u : this.positions){
			//message should not be received by the user sending it
				u.receive(msg);
			
		}
	}
	@Override
	public void addUser(Position user) {
		// TODO Auto-generated method stub
		this.positions.add(user);
	}
	@Override
	public void sendMessage(String msg, Position position) {
		// TODO Auto-generated method stub
		for(Position u : this.positions){
			//message should not be received by the user sending it
			if(u != position){
				u.receive(msg);
			}
		}
		for(User u : this.users){
			//message should not be received by the user sending it
			
				u.receive(msg);
			
		}
	}

	

}