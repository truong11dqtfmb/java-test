package file;

import java.io.Serializable;

public class Student  implements Serializable{

    private int id;
    private String name;
    private int gender;
    private String clazz;
    private Double dtb;

    public Student(int id, String name, int gender, String clazz, Double dtb) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.clazz = clazz;
        this.dtb = dtb;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Double getDtb() {
        return dtb;
    }

    public void setDtb(Double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", clazz=" + clazz + ", dtb=" + dtb + '}';
    }

}
