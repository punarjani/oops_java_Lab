class PrintEven implements Runnable{
  Printer printer;
  int max;
  PrintEven(Printer printer, int max){
    this.printer = printer;
    this.max = max;
  }
  public void run() {
    for(int i = 2; i <= max; i+=2){		
      printer.printEven(i);
    }   
  }
}

class PrintOdd implements Runnable{
  Printer printer;
  int max;
  PrintOdd(Printer printer, int max){
    this.printer = printer;
    this.max = max;
  }
  public void run() {
    for(int i = 1; i <= max; i+=2){
      printer.printOdd(i);
    }   
  }
}

public class Printer {
  boolean evenFlag = false;
  public void printEven(int num){
    synchronized (this) {
      while(!evenFlag){
        try {
          wait();
        } catch (InterruptedException e) {
          System.out.println("Thread Interrupted" + e.getMessage());
        }
      }
      System.out.println(Thread.currentThread().getName() + " - " + num);
      evenFlag = false;
      notify();
    }
  }
	
  public void printOdd(int num){
    synchronized (this) {
      while(evenFlag){
        try {
          wait();
        } catch (InterruptedException e) {
          System.out.println("Thread Interrupted" + e.getMessage());
        }
      }
      System.out.println(Thread.currentThread().getName() + " - " + num);
      evenFlag = true;
      notify();
    }
  }
  public static void main(String[] args) {
    Printer printer = new Printer();
    Thread t1 = new Thread(new PrintOdd(printer, 10), "ODD");
    Thread t2 = new Thread(new PrintEven(printer, 10), "EVEN");
    t1.start();
    t2.start();
  }
}
