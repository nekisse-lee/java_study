package java8_3.ch07_inheritance.ch7_04;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = setHour(hour);
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = hour;
        }
        throw new IllegalArgumentException(" 0 이상 23 미만의 숫자만 가능합니다.");
    }


    @Override
    public String toString() {
        return "Time{" +
            "hour=" + hour +
            ", minute=" + minute +
            ", second=" + second +
            '}';
    }

    public static void main(String[] args) {

        Time time = null;
        try {
            time = new Time(24, 30, 30);
            System.out.println(time.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
