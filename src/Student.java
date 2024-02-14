import java.time.LocalDate;
import java.time.Period;

public class Student {
    String name;
    LocalDate dateOfBirth;
    String phoneNumber;
    String nationality;

    public Student() {
    }

    public Student(String name, LocalDate dateOfBirth, String phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

//    Task 2 Nahodim age studenta
    public  int getAge (){
        LocalDate currentDate = LocalDate.now();
        Period period= Period.between(currentDate,dateOfBirth);
        int age = period.getYears();
        return age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
