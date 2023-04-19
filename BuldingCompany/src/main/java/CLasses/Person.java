package CLasses;

import java.util.Objects;

public abstract class Person {

    protected String personName;
    protected int personAge;
    protected int id;

    public Person(String personName, int personAge, int id) {
        this.personName = personName;
        this.personAge = personAge;
        this.id = id;
    }

    public Person() {
        this.personName = personName;
        this.personAge = personAge;
        this.id = id;
    }

    abstract void printPersonInfo();

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

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personAge == person.personAge && id == person.id && Objects.equals(personName, person.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, personAge, id);
    }
}
