package testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWriteAndReadTest {

    public static void main(String[] args) {
        Path test = Paths.get("src/testing/writeAndRead.txt");

//        System.out.println(Files.exists(test));

        try {
            List<String> testFile = Files.readAllLines(test);
            System.out.println(testFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> names = Arrays.asList("John", "Fred", "Sally");

        try {
            Files.write(test, names);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> testFile = Files.readAllLines(test);
            System.out.println(testFile);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
