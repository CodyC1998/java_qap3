package Problem1;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person("Dave", 27, "M");
        System.out.println(person1);

        Student person2 = new Student("Jane Joe", 16, "F", "HS95129", 3.5);
        System.out.println(person2);

        Teacher person3 = new Teacher("John Java", 34, "M", "Computer Science", 50000);
        System.out.println(person3);

        CollegeStudent person4 = new CollegeStudent("Rob Bob", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(person4);
    }
}
