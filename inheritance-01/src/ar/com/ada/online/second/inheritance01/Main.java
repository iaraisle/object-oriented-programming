package ar.com.ada.online.second.inheritance01;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Matt", "Murdock");
        Person person2 = new Person("Stephen", "Strange");
        Person person3 = new Person("Natasha", "Romanov");
        Person person4 = new Person("Carol", "Danvers");

        System.out.println("person1.toString(): " + person1.toString());
        System.out.println("person2.toString(): " + person2.toString());
        System.out.println("person3.toString(): " + person3.toString());
        System.out.println("person4.toString(): " + person4.toString());

        System.out.println("\nMatt Murdock hashCode: " + person1.hashCode());
        System.out.println("Stephen Strange hashCode: " + person2.hashCode());
        System.out.println("Natasha Romanov hashCode: " + person3.hashCode());
        System.out.println("Carol Danvers hashCode: " + person4.hashCode());

        System.out.printf("\nSe compara si %s %s es igual a %s %s = %s"
                , person1.getName(), person1.getLastName(), person2.getName(), person2.getLastName()
                , person1.equals(person2));

        System.out.printf("\nSe compara si %s %s es igual a %s %s = %s"
                , person2.getName(), person2.getLastName(), person3.getName(), person3.getLastName()
                , person2.equals(person3));

        System.out.printf("\nSe compara si %s %s es igual a %s %s = %s"
                , person3.getName(), person3.getLastName(), person4.getName(), person4.getLastName()
                , person3.equals(person4));
    }
}
