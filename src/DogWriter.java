import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class DogWriter {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("Golden Doodle", "Midas", "Gold");
            Gson gson = new Gson();
            String jsonString = gson.toJson(dog);
            System.out.println(jsonString);
            FileWriter fileWriter = new FileWriter("dog.json");
            fileWriter.write(jsonString);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
