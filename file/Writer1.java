package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Writer1 {

    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("file1.txt");
            writer.write("alo test alo");

        } catch (IOException ex) {
            Logger.getLogger(Writer1.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Writer1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
