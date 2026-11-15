package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class Trainee {
    private String name;
    private City city;

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee other) {
        this.name = other.getName();
        this.city = new City(other.getCity().getDescription());
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city){
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
