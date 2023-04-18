public class Client extends Person{

    private String personSurname;
    private String companyName;
    private int telephoneNumber;

    public Client(String personName, int personAge, int id, int i, String personSurname, String companyName, int telephoneNumber) {
        super(personName, personAge, id, i);
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

}
