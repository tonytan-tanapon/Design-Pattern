package Mediator2;

import java.util.Random;

//https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		
		
		PositionImp pos1 = new PositionImp(mediator, "Position1");
		
		
		mediator.addUser(user1);
	
		
		mediator.addUser(pos1);
	
		
		while(true) {
			Random rand = new Random();
			 int rand_int1 = rand.nextInt(2);
			 System.out.println(rand_int1);
			if(rand_int1%2 == 1 ) {
				user1.send("Hi All");
			}else {
				pos1.send("Hello world");
			}
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}