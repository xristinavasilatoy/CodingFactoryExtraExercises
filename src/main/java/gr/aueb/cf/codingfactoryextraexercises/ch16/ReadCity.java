package gr.aueb.cf.codingfactoryextraexercises.ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadCity {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("city.ser"))) {
            City loadedCity = (City) in.readObject();
            System.out.println(loadedCity.getDescription());
        }
    }
}
