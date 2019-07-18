package thisisjava.chap16_stream.sec02.stream_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/nekisse/Documents/intellij_workspace/gje_java/chap004/src/main/java/thisisjava");

        Stream<Path> pathStream = Files.list(path);

        pathStream.forEach(p -> System.out.println(p.getFileName()));
    }
}
