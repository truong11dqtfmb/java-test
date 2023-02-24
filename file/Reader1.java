package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader1 {
    public static void main(String[] args) {
        FileReader reader = null;
        
        try {
            reader = new FileReader("file1.txt");
            
            while(reader.ready()){
                int d = reader.read();
                System.out.println((char) d);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Reader1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
