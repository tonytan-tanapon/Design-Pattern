
public class PaperPrintMain  extends Thread {

		  public static void main(String[] args) {
		    PaperPrint pp = new PaperPrint();

		    // Creating a new thread and invoking
		    // our print() method on it
		    new Thread() {
		      @Override
		      public void run() {
		        pp.print(60);
		      }
		    }
		      .start();

		    // Creating a new thread and invoking
		    // our reprint method on it
		    new Thread() {
		      @Override
		      public void run() {
		        pp.reprint();
		      }
		    }
		      .start();
		  }
		}