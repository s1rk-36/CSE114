//Kristian Hajredinaj ID:113367328

public class Person {
    private String name, address, phoneNumber, email;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Class: Person";
    }
}
class Student extends Person{
    private final String FRESHMAN = "Freshman";
    private final String SOPHOMORE = "Sophomore";
    private final String JUNIOR = "Junior";
    private final String SENIOR = "Senior";

    private String status;
    @Override
    public String toString() {
        return "Name: " + getName() + " Class: Student";
    }
}
class Employee extends Person{

    private double salary;
    private String office;
    private int experience;

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: Employee";
    }
}
class Faculty extends Employee{
    private String officeHours;
    private String rank;

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: Faculty";
    }
}
class StaffMember extends Employee{
    private String title;

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: StaffMember";
    }
}