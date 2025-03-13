package Problem1;

class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;
    
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}