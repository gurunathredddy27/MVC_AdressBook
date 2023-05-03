import java.util.ArrayList;

public class AdressBookRepo {

    ArrayList<PersonData> personList = new ArrayList<>();

    public void addPerson(PersonData person){
        personList.add(person);
    }
    public void displayPersons(){
        for (PersonData p : personList){
            System.out.println(p.getFirstName());
            System.out.println(p.getLastName());
        }
    }

    public void update(){

    }
    public void delete(PersonData personDelete){
        if(personList.remove(personDelete)){
            System.out.println("Deleted the person data");
        }else{
            System.out.println("Person data is not found");
        }
    }
}
