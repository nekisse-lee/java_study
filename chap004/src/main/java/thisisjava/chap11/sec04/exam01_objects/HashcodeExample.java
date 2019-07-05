package thisisjava.chap11.sec04.exam01_objects;

import java.util.Objects;

public class HashcodeExample {
    public static void main(String[] args) {



    }

    static class Student {
        int sno;
        String name;

        public Student(int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }

        @Override
        public boolean equals(Object obj) {

            if (obj instanceof Student) {
                Student s = (Student) obj;
                if (s.sno == this.sno) {
                    if (s.name.equals(this.name)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

}
