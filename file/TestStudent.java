package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStudent {

    private static final String fileName = "st.txt";

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
//1.Nhap
        list.add(new Student(1, "truong", 0, "C2108G1", 8.8));
        list.add(new Student(2, "quoc", 1, "C2108G2", 3.4));
        list.add(new Student(3, "dao", 0, "C2108G3", 8.3));
        list.add(new Student(4, "tuan", 1, "C2108G1", 4.8));
        list.add(new Student(5, "thanh", 1, "C2108G1", 9.9));
//2.Hien thi
        list.forEach(System.out::println);

//3.Write - Out
//        ObjectOutputStream out = null;
//        try {
//            out = new ObjectOutputStream(new FileOutputStream(fileName));
//            out.writeObject(list);
//        } catch (Exception ex) {
//            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                out.close();
//            } catch (IOException ex) {
//                Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

//4.Read - In
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream(fileName));
            List<Student> student = (List<Student>) in.readObject();
            student.forEach(System.out::println);
        } catch (Exception ex) {
            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void writerStudent(List<Student> list) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(list);
        } catch (Exception ex) {
            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void readerStudent(List<Student> list) {

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream(fileName));
            List<Student> student = (List<Student>) in.readObject();
            student.forEach(System.out::println);
        } catch (Exception ex) {
            Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(TestStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }
}
