package ChainTest;

public class Dollar20Dispenser implements DispenseChain{

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void process() {
		System.out.println("process dollar 20");
		//next 
		this.chain.process();
	}

}