package gr.aueb.cf.codingfactoryextraexercises.ch16;
import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable{

    private static final long serialVersionUID =1L;
    private String Description;


    public City(String Description) {
        this.Description = Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        City other = (City) obj;

        return Objects.equals(this.getDescription(),other.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getDescription());
    }
}
