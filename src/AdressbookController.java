import java.util.Scanner;

public class AdressbookController {
    public static PersonData readPersonDetailFromConsole(){
        Scanner sc = new Scanner(System.in);

        String fName = sc.nextLine();
        String lName = sc.nextLine();

        PersonData p = new PersonData();
        p.setFirstName(fName);
        p.setLastName(lName);
        return p;
    }
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add, 2.Display, 3.Update, 4.Delete");
            int choices = sc.nextInt();
            switch (choices){
                case 1:
                    PersonData Person = readPersonDetailFromConsole();
                    AdressBookService adressBookService = new AdressBookService();
                    adressBookService.addPerson();
                    break;
                case 2:
                    AdressBookRepo adressBookRepo = new AdressBookRepo();
                    adressBookRepo.displayPersons();
                    break;
                case 3:
                    break;
                case 4:
                    adressBookRepo = new AdressBookRepo();
                    System.out.println("Enter the First Name of person to delete");
                    String firstNameDelete = sc.nextLine();
                    System.out.println("Enter the Last Name of person to delete");
                    String lastNameDelete = sc.nextLine();
                    PersonData personDelete = null;
                    personDelete.setFirstName(firstNameDelete);
                    personDelete.setLastName(lastNameDelete);
                    adressBookRepo.delete(personDelete);
                    break;

                default:
                    System.out.println("Enter correct Input");

            }
        }
    }
}
