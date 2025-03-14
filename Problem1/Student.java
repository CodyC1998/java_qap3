package Problem1;

class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // getter and setters

    public String getIdNum() {
        return myIdNum;
    }
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }
    public double getGPA() {
        return myGPA;
    }
    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
