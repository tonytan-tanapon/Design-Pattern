package Observer;
//https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
public class ObserverImp implements Observer {
	
	private String name;
	private Subject subject;
	
	public ObserverImp(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) subject.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.subject=sub;
	}

}