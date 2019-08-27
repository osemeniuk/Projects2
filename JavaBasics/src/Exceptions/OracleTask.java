package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class OracleTask {

    public static void main(String[] args) {
    }

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        }
        catch (FileNotFoundException e){
            System.out.println("catching FileNotFound");
        }

        catch(IOException ex){
            System.out.println("catching IOException");
        }
            finally {
            if (input != null) {
                try {
                    input.close();
                }
                catch (IOException e){
                    System.out.println("closing");
                }
            }
        }
    }

}
