public class AdressBookService {


    public void addPerson() {
        AdressBookRepo adressBookRepo = new AdressBookRepo();

        adressBookRepo.addPerson(new PersonData());
    }
}
