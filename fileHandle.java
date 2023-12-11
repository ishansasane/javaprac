import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class fileHandel {
    public static void main(String[] args) {

        // code to create a new file 
        File myFile = new File("ishan.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            FileWriter mWriter=new FileWriter("ishan.txt");
            mWriter.write("this is our a written text java file ");
            mWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // File myFile = new File("ishan.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}