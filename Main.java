import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = (int)(Math.random()*100) + 1;
    int y;
    int z=0;
    System.out.println("Guess a number between 1 to 100");
    do{
      y = scan.nextInt();
      z++;
      if(y<x){
        System.out.println("Too low");
      }else if(y>x){
        System.out.println("Too high");
      }else{
        System.out.println("You guessed it in " + z + " tries.");

      }
    }while(y!=x);


  }
}