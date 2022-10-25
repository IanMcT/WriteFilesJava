import java.io.FileWriter;
import java.io.IOException;
class Main {
  public static void main(String[] args) {
     try{
       FileWriter file = new FileWriter("filename.txt");
       file.write("Here is my file.\n\nNew line!");
       file.close();
     }catch(IOException e)
       {
         System.out.println("Error");
         e.printStackTrace();
       }
  }
}