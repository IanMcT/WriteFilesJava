import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate; // import the LocalDate class
class Main {
  public static void main(String[] args) {
     try{
       Scanner input = new Scanner(System.in);
       FileWriter file = new FileWriter("filename.txt", true);
       String text = input.nextLine();
       file.write(LocalDate.now()+" " + text + "\n");
       file.close();
     }catch(IOException e)
       {
         System.out.println("Error");
         e.printStackTrace();
       }
  }
}