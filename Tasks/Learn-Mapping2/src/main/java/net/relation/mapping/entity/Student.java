package net.relation.mapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Integer studentId;
    private String studentName;
    private String about;
    @OneToOne(mappedBy = "student")
    private Laptop laptop;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String about, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAbout() {
        return about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentId=" + studentId +
//                ", studentName='" + studentName + '\'' +
//                ", about='" + about + '\'' +
//                ", laptop=" + laptop +
//                '}';
//    }
}