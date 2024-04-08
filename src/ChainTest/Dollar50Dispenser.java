package ChainTest;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void process() {
		System.out.println("process dollar 50");
		//next 
		this.chain.process();
	
	}

}