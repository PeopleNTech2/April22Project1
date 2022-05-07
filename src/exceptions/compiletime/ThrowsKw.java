package exceptions.compiletime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKw {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\PIIT_NYA\\eclipse-workspace\\Apr22-Project1\\src\\class-notes");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = " ";
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        fileReader.close();
        bufferedReader.close();

    }

}
