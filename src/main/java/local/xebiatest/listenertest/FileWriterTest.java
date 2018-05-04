
import java.io.*;

public class FileWriterTest {

  public static void main(String[] args) throws IOException {

    System.out.println("Writing...");

    // File logfile = new File("XLRActivityLog.txt");
    FileWriter logwriter = new FileWriter("XLRActivityLog.txt", true);

    // logfile.createNewFile();

    logwriter.write("EventData_Test");

    logwriter.flush();

  }

}
