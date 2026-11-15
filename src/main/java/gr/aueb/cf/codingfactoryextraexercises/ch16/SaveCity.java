package gr.aueb.cf.codingfactoryextraexercises.ch16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveCity {

    public static void main(String[] args) throws IOException{

        City city = new City("Athens");

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("city.ser"))) {
            out.writeObject(city);
        }
        System.out.println("City saved");
    }

}
