package thisisjava.chap16_stream.sec11.stream_collect;

public class Student {

    public enum Sex{MALE, FEMALE}

    public enum City{Seoul,Busan}

    private String name;
    private  int score;
    private Sex sex;
    private City city;

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", score=" + score +
            ", sex=" + sex +
            ", city=" + city +
            '}';
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }
}
