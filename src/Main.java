import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans la Formation Git!");
    }

    //Renomer la méthode avec le numéro de votre groupe
    public void initializeGroupX() {
        List<Person> members = new ArrayList<Person>();
        //Ajouter vos noms
        members.add(new Person("Guillaume"));

        //Ajouter le numéro de votre groupe et une adresse mail valide
        Group group = new Group("GroupX", members, "contact@mail.com");

        group.show();
    }

}
