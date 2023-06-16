import java.util.Scanner;
class Equ {
  public static void main(String[] args) {
    Scanner reader=new Scanner(System.in);
    System.out.print("enter a number : ");
    int x=reader.nextInt();
    System.out.print("y = ");
    if(x>0){
    	System.out.println("1");
    }
    else if(x==0){
    	System.out.println("0");
    }
    else{
    	System.out.println("-1");
    }
    
  }
}
