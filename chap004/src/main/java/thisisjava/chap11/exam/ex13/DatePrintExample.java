package thisisjava.chap11.exam.ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy 년 MM월 dd일 E요일 HH시 mm분");
        System.out.println("simpleDateFormat = " + simpleDateFormat.format(now));

    }
}
