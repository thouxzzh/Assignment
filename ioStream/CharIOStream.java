package ioStream;
import java.io.*;

public class CharIOStream {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println(C:\Users\thous\eclipse-workspace\Assignment\src\ioStream\\"Input stream and output Stream");
            return;
        }

        char b[] = new char[128];

        try {
            FileReader obj1 = new FileReader(args[0]); // Reading from input file
            FileWriter obj2 = new FileWriter(args[1]); // Writing to output file

            int count = 0, read;
            
            while ((read = obj1.read(b)) != -1) {  // Fixed while condition
                obj2.write(b, 0, read);  // Write only the read characters
                count += read;
            }

            System.out.println("Total Count: " + count + " characters.");

            obj1.close();
            obj2.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
