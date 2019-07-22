package thisisjava.chap15_collection.exam.exam08;

import java.util.Objects;

public class Student {
    public int sno;
    public String name;


    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return sno == student.sno;
    }
}