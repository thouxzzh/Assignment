//ioStream ---write
package ioStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream02 { 
    public static void main(String args[]) {
        String data = "Welcome to the Smartcliff Training";
        
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\thous\\eclipse-workspace\\Assignment\\src\\ioStream\\output.txt"); 
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
            
            System.out.println("Data written to file successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
