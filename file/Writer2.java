package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Writer2 {

    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("writer2.txt"));

            out.write("aloalo");
            out.write("\n");
            out.write("dao quoc truong");
            out.write("\n");

            out.write("oke");

        } catch (IOException ex) {
            Logger.getLogger(Writer2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Writer2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
