// Java program to demonstrate the use of wait() method
class PaperPrint {

  private int paper = 40;

  // This method prints the number of pages
  public synchronized void print(int paperprinted) {
    for (int i = 1; i <= paperprinted; i++) {
      if (paper == 0) {
        System.out.println(
          i - 1 + " sheets of paper printed and " + paper + " remain(s)"
        );

        System.out.println("Invoking the wait() method");

        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println("Continuing the printing process:");
      }

      paper--;
    }

    System.out.println("The printing process is complete");
  }

  // reprint() increases the bullets by 40 everytime 
  // it is invoked and calls the notify() method
  public synchronized void reprint() {
    System.out.println(
      "Reloading the printer and resuming " + "the thread using notify()"
    );
    paper += 40;
    notify();
  }


}

