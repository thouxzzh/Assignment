package ioStream;
import java.io.*;
public class ByteIOStream {
    public static void main(String args[]) {
        byte b[] = new byte[128];
        try {
            FileInputStream obj1 = new FileInputStream("C:\\Users\\thous\\eclipse-workspace\\Assignment\\src\\ioStream\\input.txt");
            FileOutputStream obj2 = new FileOutputStream("C:\\Users\\thous\\eclipse-workspace\\Assignment\\src\\ioStream\\output.txt");

            System.out.println("Bytes available: " + obj1.available());
            int count = 0, read;

            while ((read = obj1.read(b)) != -1) { 
                obj2.write(b, 0, read); 
                count += read;
            }

            System.out.println("Total bytes copied: " +count);
            obj1.close();
            obj2.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } 
        catch (IOException e) {
            System.out.println("Error reading or writing file: " +e);
        }
    }
}
