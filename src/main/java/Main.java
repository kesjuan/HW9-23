public class Main {
    public static void main(String[] args) {

        Person person = new Person("jerry", "roane");
        Person person1 = new Person("berry", "scoth");
        Person[] people = new Person[2];
        people[0] = person;
        people[1] = person1;
        PersonHandler team = new PersonHandler(people);
        System.out.println(team.whileLoop());
        System.out.println(team.forLoop());
        System.out.println(team.forEachLoop());
    }
}
