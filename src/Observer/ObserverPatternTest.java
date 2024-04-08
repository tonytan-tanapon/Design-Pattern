package Observer;

public class ObserverPatternTest {
//	https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java
	public static void main(String[] args) {
		//create subject
		SubjectImp topic = new SubjectImp();
		
		//create observers
		Observer obj1 = new ObserverImp("Obj1");
		Observer obj2 = new ObserverImp("Obj2");
		Observer obj3 = new ObserverImp("Obj3");
		
		//register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		//attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
		
		obj1.update();
		topic.postMessage("New Message2");
	}

}