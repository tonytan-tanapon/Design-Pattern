package ChainTest;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void process();
}