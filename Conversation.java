import java.util.Scanner;
import java.util.Random;
import java.util.*;

class Conversation {

  public static void main(String[] arguments) {

      /** Created an array of canned responses. */
      String [] auto_responses = {"How are you", "Tell me more", "That's so interesting", "Wow", "Mmm-hm","Well I wish you luck" };

     /** Created a scanner */ 
      Scanner input = new Scanner(System.in);
      ArrayList <String> transcript = new ArrayList<String>();
      
      int num_rounds = input.nextInt();
      
      /** Prints out the amount of lines requested by the user */
      System.out.println("How many rounds?:" + num_rounds);
      input.nextLine();

      /** Prints intro question */ 
     
      System.out.println("Hi there! What's on your mind?");

      /** Prints out statement and adds it to the transcript */
      System.out.println("Wonderful! Now, what would you like to talk about?");
      transcript.add("Wonderful! Now, what would you like to talk about?");


      Random rand = new Random();

    
      /** While loop to replace each word in response, and respond with the autoresponses otherwise. */

      while (num_rounds > 0 ){
        String person_Response = input.nextLine();
        transcript.add(person_Response);
        int flag = 0; 

        if (person_Response.contains("my")){
          person_Response = person_Response.replace("my", "your");
          flag = 1;
        }

        else if (person_Response.contains("your")){
          person_Response = person_Response.replace("your", "my");
          flag = 1;
        }

        if(person_Response.contains(" I ")){
          person_Response = person_Response.replace(" I ", "you");
          flag = 1;
        }

        if(person_Response.contains("you")){
          person_Response = person_Response.replace("you", " I ");
          flag = 1;
        }

        if(person_Response.contains("me")){
          person_Response = person_Response.replace("me", "you");
          flag = 1;
        }

        if(person_Response.contains("you")){
          person_Response = person_Response.replace("you", "me");
          flag = 1;
        }

        if(person_Response.contains("am")){
          person_Response = person_Response.replace("am", "are");
          flag = 1;
        }

        if (flag == 0){
          int index = rand.nextInt(auto_responses.length);
          System.out.println(auto_responses[index]);
          transcript.add(auto_responses[index]);
        }

        if (flag == 1){
          System.out.println(person_Response);
          transcript.add(person_Response);
        }

        num_rounds -= 1;
      }

      /** Prints ending statement, and complete transcript. */
      System.out.println("Bye! It was nice talking to you");
      transcript.add("Bye! It was nice talking to you");
      System.out.println(transcript);
      input.close();
    }

}




          