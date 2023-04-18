public abstract class Person {

    private String personName;
    private int personAge;
    private int id;

    public Person(String personName, int personAge, int id) {
        this.personName = personName;
        this.personAge = personAge;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

}
