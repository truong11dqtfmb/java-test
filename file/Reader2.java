package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader2 {

    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("writer2.txt"));

            while (in.ready()) {
                System.out.println(in.readLine());
            }
        } catch (Exception ex) {
            Logger.getLogger(Reader2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
