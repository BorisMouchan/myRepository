package CLasses;

import java.util.Objects;

public class Client extends Person {

    private String personSurname;
    private String companyName;
    private int telephoneNumber;

    public Client(String personName, int personAge, int id, String personSurname, String companyName, int telephoneNumber) {
        super(personName, personAge, id);
        this.personSurname = personSurname;
        this.companyName = companyName;
        this.telephoneNumber = telephoneNumber;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
   public void printPersonInfo() {
        System.out.println("Were is my project?");
    }

    @Override
    public String toString() {
        return "personSurname " + personSurname + "\n" +
                "companyName " + companyName + "\n" +
                "telephoneNumber "  + telephoneNumber +  "\n"
                 + "name " + getPersonName() +"\n"+ "age " + getPersonAge()+ "\n" + "id "+getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return telephoneNumber == client.telephoneNumber && Objects.equals(personSurname, client.personSurname) && Objects.equals(companyName, client.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), personSurname, companyName, telephoneNumber);
    }
}
