package ChainTest;


public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void process() {
		System.out.println("process dollar 10");
		//next last
//		this.chain.process();
	}

}