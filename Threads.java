public class Threads {
  public Threads() {
    BasicExample();
    IsAliveExample();
  }

  private void BasicExample(){
    // as we just extended from the thread class we can start
    // the thread directly using our class.
    var extendThread = new ExtendThreadClass();
    extendThread.start();

    // We have to create a new thread class with our class as an
    // argument in order to achieve the same results with an interface.
    var implementThread = new ImplementRunnableClass();
    Thread thread = new Thread(implementThread);
    thread.start();
  }

  private void IsAliveExample() {
    ExtendThreadClass thread = new ExtendThreadClass();
    thread.start();

    // Wait for the thread to finish
    while(thread.isAlive()) {
      System.out.println("Waiting...");
    }
  }

  class ExtendThreadClass extends Thread {
    public void BasicExample() {
      ExtendThreadClass thread = new ExtendThreadClass();
      thread.start();
      System.out.println("This code is outside of the thread");
    }

    public void run() {
      System.out.println("This code is running in a thread");
    }
  }

  class ImplementRunnableClass implements Runnable {
    public void BasicExample() {
      ImplementRunnableClass obj = new ImplementRunnableClass();
      Thread thread = new Thread(obj);
      thread.start();
      System.out.println("This code is outside of the thread");
    }

    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
}
