//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.util.Scanner; //Learned from "https://www.w3schools.com/java/java_files_read.asp"
import java.io.*; //imports everything of java.io
//"https://www.geeksforgeeks.org/java-program-to-read-content-from-one-file-and-write-it-into-another-file/"
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // The file reading process may sometimes give
        // IOException

        // Try block to check for exceptions
        try {

            // Creating a FileReader object and
            // file to be read is passed as in parameters
            // from the local directory of computer
            BufferedReader itReads = new BufferedReader(new FileReader("products.csv"));

            // FileReader will open that file from that
            // directory, if there is no file found it will
            // through an IOException

            // Creating a FileWriter object
            BufferedWriter itWrites = new BufferedWriter(new FileWriter("transformed_products.csv"));

            // It will create a new file with name
            // "gfgOutput.text", if it is already available,
            // then it will open that instead

            // Declaring a blank string in which
            // whole content of file is to be stored
            String str = "";

            int i;

            // read() method will read the file character by
            // character and print it until it end the end
            // of the file

            // Condition check
            // Reading the file using read() method which
            // returns -1 at EOF while reading
            while ((i = itReads.read()) != -1) {

                // Storing every character in the string
                str += (char) i;
            }

            // Print and display the string that
            // contains file data
            System.out.println(str);

            // Writing above string data to
            // FileWriter object
            itWrites.write(str);

            // Closing the file using close() method
            // of Reader class which closes the stream &
            // release resources that were busy in stream
            itReads.close();
            itWrites.close();

            // Display message
            System.out.println(
                    "File reading and writing both done");
        }

        // Catch block to handle the exception
        catch (IOException e) {

            // If there is no file in specified path or
            // any other error occurred during runtime
            // then it will print IOException

            // Display message
            System.out.println(
                    "There are some IOException");
        }


//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}