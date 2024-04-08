package Proxy;

public class ProxyPatternTest {

	public static void main(String[] args){
//		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "J@urnalD$v");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}