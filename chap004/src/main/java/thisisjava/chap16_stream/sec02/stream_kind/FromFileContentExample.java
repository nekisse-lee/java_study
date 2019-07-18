package thisisjava.chap16_stream.sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/nekisse/Documents/intellij_workspace/gje_java/chap004/src/main/java/thisisjava/chap16_stream/sec02/stream_kind/linedata.txt");

        Stream<String> stream;

        //Files.lines() 메소드 이용
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        stream.close();
        System.out.println();

        //BufferedReader의  lines()메소드 이ㅛㅇ
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        Stream<String> lineStream = br.lines();
        lineStream.forEach(System.out::println);
        lineStream.close();
        System.out.println();


    }
}
