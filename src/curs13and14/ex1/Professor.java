package curs13and14.ex1;

import java.time.LocalDate;
import java.time.Period;

public class Professor {

    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private String dateOfBirth;
    private long cnp;
    private String address;

    // nu o sa folosesc constructor


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int yearsBetween = Period.between(birthDate, LocalDate.now()).getYears();
        if(yearsBetween != age){
            System.out.println("Something is wrong with your age or date of birth. Please check again!");
        } else{
            System.out.println("All good!");
            this.dateOfBirth = dateOfBirth;
        }
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", cnp=" + cnp +
                ", address='" + address + '\'' +
                '}';
    }
}
