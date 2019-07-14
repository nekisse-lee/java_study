package thisisjava.chap14_larmbda.exam.exam06;

public class Student {
    private String name;
    private int mathScore;
    private int englishScore;

    public Student(String name, int mathScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}
