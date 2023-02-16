import java.util.Scanner;
import java.util.*;

class Conversation {

  public static void main(String[] arguments) {

    int i;
    

    System.out.println("How many rounds?:");
    System.out.println("Welcome! Let's chat");
    

      Scanner input = new Scanner(System.in);
      int num_rounds = input.nextInt();


      System.out.println("Print" + num_rounds);



    
    
    
    //clear out input buffer
    input.nextLine();
    

    String user_input = input.next();
    //String user_input = "I love CS";
    String [] words = user_input.split(" ");
  }
}

