package ar.com.ada.online.second.inheritance01;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    //Constructores
    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //Getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person { name = "
                + this.name +
                ", lastName = " + this.lastName + "}";
    }
    // También se puede escribir:
    //String.format("Person: {name = %s, lastName = %s} ", this.name, this.lastName);

    @Override
    public int hashCode() {
        return 20 * Objects.hash(this.name, this.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return name.equals(that.name) &&
                lastName.equals(that.lastName);
    }
}
