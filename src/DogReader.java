import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DogReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("dog.json"));
            Dog dog = gson.fromJson(reader, Dog.class);
            System.out.printf("Dog Details:\n" +
                    "Breed: %s\n" +
                    "Color: %s\n" +
                    "Name: %s\n", dog.getBreed(),dog.getColor(),dog.getName());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}