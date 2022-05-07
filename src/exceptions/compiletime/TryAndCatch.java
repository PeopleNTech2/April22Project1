package exceptions.compiletime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryAndCatch {
    public static void main(String[] args) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\PIIT_NYA\\eclipse-workspace\\Apr22-Project1\\src\\class-notes");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            if (fileReader != null){
                bufferedReader = new BufferedReader(fileReader);
                String str = " ";
                while ((str = bufferedReader.readLine()) != null){
                    System.out.println(str);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
