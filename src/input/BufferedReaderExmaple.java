package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExmaple{
    
  // Main Method 
  public static void main(String [] args) throws IOException {
    // Creating BuferedReader Object
    // InputStreamReader converts bytes to 
    // stream of character
    BufferedReader reader = new 
      BufferedReader(new InputStreamReader(System.in));
      // Asking for input from user
      System.out.print("Enter Name : ");

      // String reading internally 
      String stringValue = reader.readLine();
      System.out.print("Enter Age : ");
                  
      // Integer reading internally
      int integerValue = 
      Integer.parseInt(reader.readLine());
                       
      // Printing String
      System.out.println("Entered Name : "+ stringValue);
                       
      //Printing Integer               
      System.out.println("Entered Age : "+ integerValue);  
        
    }
                       
  }