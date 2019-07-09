package thisisjava.chap14_larmbda.sec05.exam06_predecate;

public class Student {

    private String name;
    private String sex;
    private int score;


    public Student(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }
}
