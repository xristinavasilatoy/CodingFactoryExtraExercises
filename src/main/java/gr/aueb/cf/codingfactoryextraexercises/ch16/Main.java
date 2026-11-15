package gr.aueb.cf.codingfactoryextraexercises.ch16;

public class Main {
    public static void main(String[] args) {

        City first = new City("Athens");
        City second = new City("Athens");

        System.out.println(first.equals(second));
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        City athens = new City("Athens");
        City volos = new City("Volos");
        Trainee anna = new Trainee("Anna", athens);
        Trainee copy = new Trainee(anna);

        anna.setCity(volos);
        copy.getCity().setDescription("Paris");
        copy.setName("Marios");

        TraineeAction printName = t -> System.out.println(t.getName());
        printName.apply(anna);

        TraineeAction printCity = trainee -> System.out.println(trainee.getCity().getDescription());
        printCity.apply(anna);

        TraineeAction changeCity = trainee -> trainee.getCity().setDescription("Pilos");
        changeCity.apply(copy);


        System.out.println(anna.getName()+", "+anna.getCity().getDescription());
        System.out.println(copy.getName()+", "+ copy.getCity().getDescription());

        execute(anna, changeCity);

        showInfo(copy);

        execute(anna, trainee -> Main.showInfo(trainee));
        execute(anna, Main::showInfo);

        execute(copy, Main::moveToRome);
    }

    public static void execute(Trainee person, TraineeAction action) {

        action.apply(person);
    }

    public static void showInfo(Trainee trainee) {
        System.out.println(trainee.getName()+", "+trainee.getCity().getDescription());
    }

    public static void moveToRome(Trainee trainee) {
        trainee.getCity().setDescription("Rome");
        System.out.println(trainee.getName()+", "+trainee.getCity().getDescription());
    }
}